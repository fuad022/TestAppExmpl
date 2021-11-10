package com.example.testappexmpl.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testappexmpl.data.model.HomeHorizontalRecyclerItemModel
import com.example.testappexmpl.databinding.HomeHorizontalRvItemBinding

class HomeHorizontalRecyclerAdapter : ListAdapter<HomeHorizontalRecyclerItemModel, HomeHorizontalRecyclerAdapter.ItemHolder>(DiffCallback()) {

    class ItemHolder(private val binding: HomeHorizontalRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: HomeHorizontalRecyclerItemModel) {
            binding.imgUserHorizontal.setImageResource(model.image)
            binding.titleHorizontal.text = model.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            HomeHorizontalRvItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private class DiffCallback : DiffUtil.ItemCallback<HomeHorizontalRecyclerItemModel>() {
        override fun areItemsTheSame(
            oldItem: HomeHorizontalRecyclerItemModel,
            newItem: HomeHorizontalRecyclerItemModel
        ) = oldItem == newItem

        override fun areContentsTheSame(
            oldItem: HomeHorizontalRecyclerItemModel,
            newItem: HomeHorizontalRecyclerItemModel
        ) = oldItem == newItem
    }

    override fun submitList(list: List<HomeHorizontalRecyclerItemModel>?) {
        super.submitList(list?.map { it.copy() })
    }
}