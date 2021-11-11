package com.example.testappexmpl.ui.profile.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testappexmpl.data.model.ProfileMainRecyclerItemModel
import com.example.testappexmpl.databinding.ProfileRvItemBinding

class ProfileMainRecyclerAdapter : ListAdapter<ProfileMainRecyclerItemModel, ProfileMainRecyclerAdapter.ItemHolder>(DiffCallback()) {

    class ItemHolder(private val binding: ProfileRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: ProfileMainRecyclerItemModel) {
            binding.proileRvTitle.text = model.title

            val profileNestedRecyclerAdapter = ProfileNestedRecyclerAdapter()
            binding.profileNestedRv.adapter = profileNestedRecyclerAdapter
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

    private class DiffCallback : DiffUtil.ItemCallback<ProfileMainRecyclerItemModel>() {
        override fun areItemsTheSame(
            oldItem: ProfileMainRecyclerItemModel,
            newItem: ProfileMainRecyclerItemModel
        ) = oldItem == newItem

        override fun areContentsTheSame(
            oldItem: ProfileMainRecyclerItemModel,
            newItem: ProfileMainRecyclerItemModel
        ) = oldItem == newItem
    }

    override fun submitList(list: List<ProfileMainRecyclerItemModel>?) {
        super.submitList(list?.map { it.copy() })
    }

}