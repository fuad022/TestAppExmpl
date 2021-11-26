package com.example.testappexmpl.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testappexmpl.data.model.HomeModel
import com.example.testappexmpl.databinding.HomeVerticalRvItemBinding

class HomeVertAdapter : ListAdapter<HomeModel, HomeVertAdapter.ItemHolder>(DiffCallback()) {

    class ItemHolder(private val binding: HomeVerticalRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: HomeModel) {
            binding.title.text = model.vertTitle
            binding.btn.text = model.titleBtn

            val homeNestedGridRecyclerAdapter = HomeNestedAdapter()
            binding.nestedRv.adapter = homeNestedGridRecyclerAdapter
            homeNestedGridRecyclerAdapter.submitList(model.list)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            HomeVerticalRvItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private class DiffCallback : DiffUtil.ItemCallback<HomeModel>() {
        override fun areItemsTheSame(
            oldItem: HomeModel,
            newItem: HomeModel
        ) = oldItem == newItem

        override fun areContentsTheSame(
            oldItem: HomeModel,
            newItem: HomeModel
        ) = oldItem == newItem
    }

    override fun submitList(list: List<HomeModel>?) {
        super.submitList(list?.map { it.copy() })
    }
}