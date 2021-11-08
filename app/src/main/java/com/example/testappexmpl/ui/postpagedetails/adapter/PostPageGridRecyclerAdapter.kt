package com.example.testappexmpl.ui.postpagedetails.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testappexmpl.data.model.HomeHorizontalRecyclerItemModel
import com.example.testappexmpl.data.model.HomeNestedGridRecyclerItemModel
import com.example.testappexmpl.data.model.HomeVerticalRecyclerItemModel
import com.example.testappexmpl.databinding.HomeHorizontalRvItemBinding
import com.example.testappexmpl.databinding.PostPageGridRvItemBinding
import com.example.testappexmpl.ui.home.adapter.HomeHorizontalRecyclerAdapter

class PostPageGridRecyclerAdapter : ListAdapter<Int, PostPageGridRecyclerAdapter.ItemHolder>(DiffCallback()) {

    class ItemHolder(private val binding: PostPageGridRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: Int) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            PostPageGridRvItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private class DiffCallback : DiffUtil.ItemCallback<Int>() {
        override fun areItemsTheSame(
            oldItem: Int,
            newItem: Int
        ) = oldItem == newItem

        override fun areContentsTheSame(
            oldItem: Int,
            newItem: Int
        ) = oldItem == newItem
    }

}