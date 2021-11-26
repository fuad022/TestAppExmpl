package com.example.testappexmpl.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testappexmpl.data.model.HomeModel
import com.example.testappexmpl.databinding.HomeHorizontalRvItemBinding

class HomeHorzAdapter : ListAdapter<HomeModel, HomeHorzAdapter.ItemHolder>(DiffCallback()) {

    class ItemHolder(private val binding: HomeHorizontalRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: HomeModel) {
            binding.image.setImageResource(model.image!!)
            binding.title.text = model.horzTitle
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