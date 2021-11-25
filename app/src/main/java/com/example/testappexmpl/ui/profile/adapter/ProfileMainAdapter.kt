package com.example.testappexmpl.ui.profile.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testappexmpl.data.model.ProfileMainRVModel
import com.example.testappexmpl.databinding.ProfileRvItemBinding

class ProfileMainAdapter : ListAdapter<ProfileMainRVModel, ProfileMainAdapter.ItemHolder>(DiffCallback()) {

    class ItemHolder(private val binding: ProfileRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: ProfileMainRVModel) {
            binding.title.text = model.title

            val profileNestedRecyclerAdapter = ProfileNestedAdapter()
            binding.nestedRv.adapter = profileNestedRecyclerAdapter
            profileNestedRecyclerAdapter.submitList(model.list.toMutableList())
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            ProfileRvItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private class DiffCallback : DiffUtil.ItemCallback<ProfileMainRVModel>() {
        override fun areItemsTheSame(
            oldItem: ProfileMainRVModel,
            newItem: ProfileMainRVModel
        ) = oldItem == newItem

        override fun areContentsTheSame(
            oldItem: ProfileMainRVModel,
            newItem: ProfileMainRVModel
        ) = oldItem == newItem
    }

    override fun submitList(list: List<ProfileMainRVModel>?) {
        super.submitList(list?.map { it.copy() })
    }

}