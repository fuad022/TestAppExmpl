package com.example.testappexmpl.ui.postpagedetails.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testappexmpl.data.model.PostPageHorizontalRecyclerItemModel
import com.example.testappexmpl.databinding.PostPageHorizontalRvItemBinding

class PostPageHorizontalRecyclerAdapter : ListAdapter<PostPageHorizontalRecyclerItemModel, PostPageHorizontalRecyclerAdapter.ItemHolder>(DiffCallback()) {

    class ItemHolder(private val binding: PostPageHorizontalRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: PostPageHorizontalRecyclerItemModel) {
            binding.imgUserHorizontal.setImageResource(model.memberImg)
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

    private class DiffCallback : DiffUtil.ItemCallback<PostPageHorizontalRecyclerItemModel>() {
        override fun areItemsTheSame(
            oldItem: PostPageHorizontalRecyclerItemModel,
            newItem: PostPageHorizontalRecyclerItemModel
        ) = oldItem == newItem

        override fun areContentsTheSame(
            oldItem: PostPageHorizontalRecyclerItemModel,
            newItem: PostPageHorizontalRecyclerItemModel
        ) = oldItem == newItem
    }

    override fun submitList(list: List<PostPageHorizontalRecyclerItemModel>?) {
        super.submitList(list?.map { it.copy() })
    }

    override fun getItemCount(): Int {
        return 5
    }
}