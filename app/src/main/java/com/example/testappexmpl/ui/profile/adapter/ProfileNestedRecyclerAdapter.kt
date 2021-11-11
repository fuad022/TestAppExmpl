package com.example.testappexmpl.ui.profile.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testappexmpl.data.model.ProfileNestedRecyclerItemModel
import com.example.testappexmpl.databinding.ProfileNestedRvItemBinding

class ProfileNestedRecyclerAdapter : ListAdapter<ProfileNestedRecyclerItemModel, ProfileNestedRecyclerAdapter.ItemHolder>(DiffCallback()) {

    class ItemHolder(private val binding: ProfileNestedRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: ProfileNestedRecyclerItemModel) {
            binding.imgCard.setImageResource(model.image)
            binding.cardName.text = model.cardName
            binding.cardDescription.text = model.cardDescription
            binding.event.text = model.event
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            ProfileNestedRvItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private class DiffCallback : DiffUtil.ItemCallback<ProfileNestedRecyclerItemModel>() {
        override fun areItemsTheSame(
            oldItem: ProfileNestedRecyclerItemModel,
            newItem: ProfileNestedRecyclerItemModel
        ) = oldItem == newItem

        override fun areContentsTheSame(
            oldItem: ProfileNestedRecyclerItemModel,
            newItem: ProfileNestedRecyclerItemModel
        ) = oldItem == newItem
    }

    override fun submitList(list: List<ProfileNestedRecyclerItemModel>?) {
        super.submitList(list?.map { it.copy() })
    }
}