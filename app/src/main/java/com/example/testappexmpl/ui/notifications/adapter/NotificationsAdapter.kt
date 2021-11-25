package com.example.testappexmpl.ui.notifications.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testappexmpl.data.model.NotificationsModel
import com.example.testappexmpl.databinding.NotificationsRvItemBinding

class NotificationsAdapter : ListAdapter<NotificationsModel, NotificationsAdapter.ItemHolder>(DiffCallback()) {

    class ItemHolder(private val binding: NotificationsRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: NotificationsModel) {
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

    private class DiffCallback : DiffUtil.ItemCallback<NotificationsModel>() {
        override fun areItemsTheSame(
            oldItem: NotificationsModel,
            newItem: NotificationsModel
        ) = oldItem == newItem

        override fun areContentsTheSame(
            oldItem: NotificationsModel,
            newItem: NotificationsModel
        ) = oldItem == newItem
    }

    override fun submitList(list: List<NotificationsModel>?) {
        super.submitList(list?.map { it.copy() })
    }
}



















