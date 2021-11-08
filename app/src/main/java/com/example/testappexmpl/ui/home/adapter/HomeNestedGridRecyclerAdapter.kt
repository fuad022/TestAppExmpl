package com.example.testappexmpl.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testappexmpl.data.model.HomeNestedGridRecyclerItemModel
import com.example.testappexmpl.data.model.HomeVerticalRecyclerItemModel
import com.example.testappexmpl.databinding.HomeNestedGridRvItemBinding

class HomeNestedGridRecyclerAdapter : ListAdapter<HomeNestedGridRecyclerItemModel, HomeNestedGridRecyclerAdapter.ItemHolder>(DiffCallback()) {

    inner class ItemHolder(private val binding: HomeNestedGridRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: HomeNestedGridRecyclerItemModel?) {
            model?.let { model ->
                binding.homeNestedGridRvItemImg.setImageResource(model.image!!)
                binding.homeNestedGridRvItemPretitle.text = model.pretitle
                binding.homeNestedGridRvItemTitle.text = model.title
                binding.root.setOnClickListener {
                    model.let { user -> setOnItemClick?.invoke(user) }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            HomeNestedGridRvItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private class DiffCallback : DiffUtil.ItemCallback<HomeNestedGridRecyclerItemModel>() {
        override fun areItemsTheSame(
            oldItem: HomeNestedGridRecyclerItemModel,
            newItem: HomeNestedGridRecyclerItemModel
        ) = oldItem == newItem

        override fun areContentsTheSame(
            oldItem: HomeNestedGridRecyclerItemModel,
            newItem: HomeNestedGridRecyclerItemModel
        ) = oldItem == newItem
    }

    override fun submitList(list: List<HomeNestedGridRecyclerItemModel>?) {
        super.submitList(list?.map { it.copy() })
    }

    private var setOnItemClick: ((HomeNestedGridRecyclerItemModel) -> Unit)? = null

    fun setOnClickListener(listener: (HomeNestedGridRecyclerItemModel) -> Unit) {
        setOnItemClick = listener
    }

    override fun getItemCount(): Int {
        return 4
    }
}