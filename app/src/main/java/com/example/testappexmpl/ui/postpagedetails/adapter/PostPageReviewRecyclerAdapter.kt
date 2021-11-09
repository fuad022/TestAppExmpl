package com.example.testappexmpl.ui.postpagedetails.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testappexmpl.data.model.PostPageReviewItemModel
import com.example.testappexmpl.databinding.PostPageReviewRvItemBinding

class PostPageReviewRecyclerAdapter : ListAdapter<PostPageReviewItemModel, PostPageReviewRecyclerAdapter.ItemHolder>(DiffCallback()) {

    class ItemHolder(private val binding: PostPageReviewRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: PostPageReviewItemModel) {
            binding.reviewProfileImg.setImageResource(model.reviewProfileImage)
            binding.reviewsFullname.text = model.reviewFullName
            binding.addedReviewText.text = model.reviewComment
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            PostPageReviewRvItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private class DiffCallback : DiffUtil.ItemCallback<PostPageReviewItemModel>() {
        override fun areItemsTheSame(
            oldItem: PostPageReviewItemModel,
            newItem: PostPageReviewItemModel
        ) = oldItem == newItem

        override fun areContentsTheSame(
            oldItem: PostPageReviewItemModel,
            newItem: PostPageReviewItemModel
        ) = oldItem == newItem
    }

    override fun submitList(list: List<PostPageReviewItemModel>?) {
        super.submitList(list?.map { it.copy() })
    }
}