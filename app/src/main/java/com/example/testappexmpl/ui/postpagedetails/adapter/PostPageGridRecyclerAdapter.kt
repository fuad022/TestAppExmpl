package com.example.testappexmpl.ui.postpagedetails.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testappexmpl.data.model.PostPageGridRecyclerItemModel
import com.example.testappexmpl.databinding.PostPageGridRvItemBinding

class PostPageGridRecyclerAdapter : ListAdapter<PostPageGridRecyclerItemModel, PostPageGridRecyclerAdapter.ItemHolder>(DiffCallback()) {

    class ItemHolder(private val binding: PostPageGridRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: PostPageGridRecyclerItemModel) {
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

    private class DiffCallback : DiffUtil.ItemCallback<PostPageGridRecyclerItemModel>() {
        override fun areItemsTheSame(
            oldItem: PostPageGridRecyclerItemModel,
            newItem: PostPageGridRecyclerItemModel
        ) = oldItem == newItem

        override fun areContentsTheSame(
            oldItem: PostPageGridRecyclerItemModel,
            newItem: PostPageGridRecyclerItemModel
        ) = oldItem == newItem
    }

    override fun submitList(list: List<PostPageGridRecyclerItemModel>?) {
        super.submitList(list?.map { it.copy() })
    }

    override fun getItemCount(): Int {
        return 3
    }
}