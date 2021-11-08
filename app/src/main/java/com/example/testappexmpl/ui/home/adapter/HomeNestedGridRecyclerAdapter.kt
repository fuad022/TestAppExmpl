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

    class ItemHolder(private val binding: HomeNestedGridRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: HomeNestedGridRecyclerItemModel) {
            binding.homeNestedGridRvItemImg.setImageResource(model.image)
            binding.homeNestedGridRvItemPretitle.text = model.pretitle
            binding.homeNestedGridRvItemTitle.text = model.title

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
}