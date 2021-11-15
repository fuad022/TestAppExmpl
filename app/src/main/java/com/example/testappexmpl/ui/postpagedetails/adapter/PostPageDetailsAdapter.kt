package com.example.testappexmpl.ui.postpagedetails.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testappexmpl.data.model.PostPageLightModel
import com.example.testappexmpl.databinding.FragmentPostPageDetailsBinding

//class PostPageDetailsAdapter : ListAdapter<PostPageLightModel, PostPageDetailsAdapter.ItemHolder>(DiffCallback()) {
//
//    class ItemHolder(private val binding: FragmentPostPageDetailsBinding) : RecyclerView.ViewHolder(binding.root) {
//        fun bind(model: PostPageLightModel) {
//            binding.postPageCollapsingImageview.setImageResource(model.image!!)
//            binding.postPagePretitle.text = model.pretitle
//            binding.postPageTitle.text = model.title
////            binding.otherMembersCount.text = model.otherMembersCount.toString()
////            binding.otherGridImageCount.text = model.otherPostPageGridImageCount.toString()
//            binding.plus.text = model.otherMembersCount.toString()
//            binding.cardPlus.text = model.otherPostPageGridImageCount.toString()
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
//        return ItemHolder(
//            FragmentPostPageDetailsBinding.inflate(
//                LayoutInflater.from(parent.context),
//                parent,
//                false
//            )
//        )
//    }
//
//    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
//        holder.bind(getItem(position))
//    }
//
//    private class DiffCallback : DiffUtil.ItemCallback<PostPageLightModel>() {
//        override fun areItemsTheSame(
//            oldItem: PostPageLightModel,
//            newItem: PostPageLightModel
//        ) = oldItem == newItem
//
//        override fun areContentsTheSame(
//            oldItem: PostPageLightModel,
//            newItem: PostPageLightModel
//        ) = oldItem == newItem
//    }
//
//    override fun submitList(list: List<PostPageLightModel>?) {
//        super.submitList(list?.map { it.copy() })
//    }
//}