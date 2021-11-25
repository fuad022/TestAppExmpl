package com.example.testappexmpl.ui.postpagedetails.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testappexmpl.data.model.PostPageGridModel
import com.example.testappexmpl.databinding.PostPageGridRvItemBinding

class PostPageGridAdapter : ListAdapter<PostPageGridModel, PostPageGridAdapter.ItemHolder>(DiffCallback()) {

    class ItemHolder(private val binding: PostPageGridRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: PostPageGridModel) {
            binding.imgGrid.setImageResource(model.image)
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

    private class DiffCallback : DiffUtil.ItemCallback<PostPageGridModel>() {
        override fun areItemsTheSame(
            oldItem: PostPageGridModel,
            newItem: PostPageGridModel
        ) = oldItem == newItem

        override fun areContentsTheSame(
            oldItem: PostPageGridModel,
            newItem: PostPageGridModel
        ) = oldItem == newItem
    }

    override fun submitList(list: List<PostPageGridModel>?) {
        super.submitList(list?.map { it.copy() })
    }

    override fun getItemCount(): Int {
        return 3
    }
}