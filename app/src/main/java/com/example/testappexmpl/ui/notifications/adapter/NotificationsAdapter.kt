package com.example.testappexmpl.ui.notifications.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testappexmpl.data.model.NotificationsRecycleItemModel
import com.example.testappexmpl.databinding.NotificationsRvItemBinding

class NotificationsAdapter : ListAdapter<NotificationsRecycleItemModel, NotificationsAdapter.ItemHolder>(DiffCallback()) {

    class ItemHolder(private val binding: NotificationsRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: NotificationsRecycleItemModel) {
            binding.notifItemImg.setImageResource(model.image)
            binding.notifItemActionComment.text = model.actionComment
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            NotificationsRvItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private class DiffCallback : DiffUtil.ItemCallback<NotificationsRecycleItemModel>() {
        override fun areItemsTheSame(
            oldItem: NotificationsRecycleItemModel,
            newItem: NotificationsRecycleItemModel
        ) = oldItem == newItem

        override fun areContentsTheSame(
            oldItem: NotificationsRecycleItemModel,
            newItem: NotificationsRecycleItemModel
        ) = oldItem == newItem
    }

    override fun submitList(list: List<NotificationsRecycleItemModel>?) {
        super.submitList(list?.map { it.copy() })
    }
}



















