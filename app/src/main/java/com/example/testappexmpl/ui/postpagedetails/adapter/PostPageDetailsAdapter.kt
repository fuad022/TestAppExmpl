package com.example.testappexmpl.ui.postpagedetails.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testappexmpl.data.model.PostPageModel
import com.example.testappexmpl.databinding.FragmentPostPageDetailsBinding

class PostPageDetailsAdapter : ListAdapter<PostPageModel, PostPageDetailsAdapter.ItemHolder>(DiffCallback()) {

    class ItemHolder(private val binding: FragmentPostPageDetailsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: PostPageModel) {
            binding.postPageCollapsingImageview.setImageResource(model.image!!)
            binding.postPagePretitle.text = model.pretitle
            binding.postPageTitle.text = model.title
            binding.otherMembersCount.text = model.otherMembersCount.toString()
            binding.otherGridImageCount.text = model.otherPostPageGridImageCount.toString()

            val postPageHorizontalRecyclerAdapter = PostPageHorizontalRecyclerAdapter()
            binding.postPageHorizontalRv.adapter = postPageHorizontalRecyclerAdapter
            postPageHorizontalRecyclerAdapter.submitList(model.membersImageList?.toMutableList())

            val postPageGridRecyclerAdapter = PostPageGridRecyclerAdapter()
            binding.postPageGridRv.adapter = postPageGridRecyclerAdapter
            postPageGridRecyclerAdapter.submitList(model.postPageGridImageList?.toMutableList())

            val postPageReviewRecyclerAdapter = PostPageReviewRecyclerAdapter()
            binding.postPageReviewVerticalRv.adapter = postPageReviewRecyclerAdapter
            postPageReviewRecyclerAdapter.submitList(model.reviewList?.toMutableList())
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            FragmentPostPageDetailsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private class DiffCallback : DiffUtil.ItemCallback<PostPageModel>() {
        override fun areItemsTheSame(
            oldItem: PostPageModel,
            newItem: PostPageModel
        ) = oldItem == newItem

        override fun areContentsTheSame(
            oldItem: PostPageModel,
            newItem: PostPageModel
        ) = oldItem == newItem
    }

    override fun submitList(list: List<PostPageModel>?) {
        super.submitList(list?.map { it.copy() })
    }
}