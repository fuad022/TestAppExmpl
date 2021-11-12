package com.example.testappexmpl.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testappexmpl.data.model.PostPageModel
import com.example.testappexmpl.databinding.HomeNestedGridRvItemBinding
import com.example.testappexmpl.ui.home.HomeFragmentDirections

class HomeNestedGridRecyclerAdapter : ListAdapter<PostPageModel, HomeNestedGridRecyclerAdapter.ItemHolder>(DiffCallback()) {
    var setOnItemClick: ((PostPageModel) -> Unit)? = null

    inner class ItemHolder(private val binding: HomeNestedGridRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: PostPageModel?) {
            model?.let { m ->
                binding.homeNestedGridRvItemImg.setImageResource(m.image!!)
                binding.homeNestedGridRvItemPretitle.text = m.pretitle
                binding.homeNestedGridRvItemTitle.text = m.title
                binding.root.setOnClickListener {
                    m.let { user ->
                        setOnItemClick?.invoke(user)
                        Navigation.findNavController(it).navigate(
                            HomeFragmentDirections.actionHomeFragmentToPostPageDetailsFragment(m)
                        )
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            HomeNestedGridRvItemBinding.inflate(
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
}