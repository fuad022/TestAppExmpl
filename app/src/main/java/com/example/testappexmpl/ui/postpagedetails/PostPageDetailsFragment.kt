package com.example.testappexmpl.ui.postpagedetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.testappexmpl.databinding.FragmentPostPageDetailsBinding
import com.example.testappexmpl.ui.postpagedetails.adapter.PostPageGridRecyclerAdapter
import com.example.testappexmpl.ui.postpagedetails.adapter.PostPageHorizontalRecyclerAdapter
import com.example.testappexmpl.ui.postpagedetails.adapter.PostPageReviewRecyclerAdapter
import com.example.testappexmpl.ui.postpagedetails.viewmodel.PostPageGridRecyclerViewModel
import com.example.testappexmpl.ui.postpagedetails.viewmodel.PostPageHorizontalRecyclerViewModel
import com.example.testappexmpl.ui.postpagedetails.viewmodel.PostPageReviewRecyclerViewModel

class PostPageDetailsFragment : Fragment() {
    private val binding by lazy { FragmentPostPageDetailsBinding.inflate(layoutInflater) }
    private val args: PostPageDetailsFragmentArgs by navArgs()
    //    private val postPageDetailsViewModel: PostPageDetailsViewModel by viewModels()
    private val gridViewModel: PostPageGridRecyclerViewModel by viewModels()
    private val horizontalViewModel: PostPageHorizontalRecyclerViewModel by viewModels()
    private val reviewViewModel: PostPageReviewRecyclerViewModel by viewModels()
    private val gridRecyclerAdapter = PostPageGridRecyclerAdapter()
    private val horizontalRecyclerAdapter = PostPageHorizontalRecyclerAdapter()
    private val reviewRecyclerAdapter = PostPageReviewRecyclerAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return binding.root
    }


}











