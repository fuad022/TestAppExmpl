package com.example.testappexmpl.ui.postpagedetails.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testappexmpl.data.model.PostPageMembersModel
import com.example.testappexmpl.databinding.PostPageHorizontalRvItemBinding

class PostPageMembersAdapter : ListAdapter<PostPageMembersModel, PostPageMembersAdapter.ItemHolder>(DiffCallback()) {

    class ItemHolder(private val binding: PostPageHorizontalRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: PostPageMembersModel) {
            binding.img.setImageResource(model.memberImg)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            PostPageHorizontalRvItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private class DiffCallback : DiffUtil.ItemCallback<PostPageMembersModel>() {
        override fun areItemsTheSame(
            oldItem: PostPageMembersModel,
            newItem: PostPageMembersModel
        ) = oldItem == newItem

        override fun areContentsTheSame(
            oldItem: PostPageMembersModel,
            newItem: PostPageMembersModel
        ) = oldItem == newItem
    }

    override fun submitList(list: List<PostPageMembersModel>?) {
        super.submitList(list?.map { it.copy() })
    }

    override fun getItemCount(): Int {
        return 5
    }
}