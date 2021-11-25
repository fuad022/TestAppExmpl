package com.example.testappexmpl.ui.postpagedetails.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testappexmpl.data.model.PostPageReviewModel
import com.example.testappexmpl.databinding.PostPageReviewRvItemBinding

class PostPageReviewAdapter : ListAdapter<PostPageReviewModel, PostPageReviewAdapter.ItemHolder>(DiffCallback()) {

    class ItemHolder(private val binding: PostPageReviewRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: PostPageReviewModel) {
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

    private class DiffCallback : DiffUtil.ItemCallback<PostPageReviewModel>() {
        override fun areItemsTheSame(
            oldItem: PostPageReviewModel,
            newItem: PostPageReviewModel
        ) = oldItem == newItem

        override fun areContentsTheSame(
            oldItem: PostPageReviewModel,
            newItem: PostPageReviewModel
        ) = oldItem == newItem
    }

    override fun submitList(list: List<PostPageReviewModel>?) {
        super.submitList(list?.map { it.copy() })
    }
}