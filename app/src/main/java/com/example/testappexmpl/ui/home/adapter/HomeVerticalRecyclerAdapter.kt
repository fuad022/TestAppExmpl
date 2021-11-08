package com.example.testappexmpl.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testappexmpl.data.model.HomeHorizontalRecyclerItemModel
import com.example.testappexmpl.data.model.HomeVerticalRecyclerItemModel
import com.example.testappexmpl.databinding.HomeVerticalRvItemBinding

class HomeVerticalRecyclerAdapter : ListAdapter<HomeVerticalRecyclerItemModel, HomeVerticalRecyclerAdapter.ItemHolder>(DiffCallback()) {

    class ItemHolder(private val binding: HomeVerticalRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: HomeVerticalRecyclerItemModel) {
            binding.homeMainRvVerticalTitle.text = model.title
            binding.homeMainRvVerticalBtn.text = model.titleBtn


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

    private class DiffCallback : DiffUtil.ItemCallback<HomeVerticalRecyclerItemModel>() {
        override fun areItemsTheSame(
            oldItem: HomeVerticalRecyclerItemModel,
            newItem: HomeVerticalRecyclerItemModel
        ) = oldItem == newItem

        override fun areContentsTheSame(
            oldItem: HomeVerticalRecyclerItemModel,
            newItem: HomeVerticalRecyclerItemModel
        ) = oldItem == newItem
    }

    override fun submitList(list: List<HomeVerticalRecyclerItemModel>?) {
        super.submitList(list?.map { it.copy() })
    }

}