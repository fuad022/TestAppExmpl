package com.example.testappexmpl.ui.postpagedetails

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.testappexmpl.data.model.PostPageLightModel
import com.example.testappexmpl.databinding.FragmentPostPageDetailsBinding
import com.example.testappexmpl.ui.postpagedetails.adapter.PostPageGridRecyclerAdapter
import com.example.testappexmpl.ui.postpagedetails.adapter.PostPageHorizontalRecyclerAdapter
import com.example.testappexmpl.ui.postpagedetails.adapter.PostPageReviewRecyclerAdapter
import com.example.testappexmpl.ui.postpagedetails.viewmodel.PostPageLightViewModel
import com.example.testappexmpl.ui.postpagedetails.viewmodel.PostPageGridRecyclerViewModel
import com.example.testappexmpl.ui.postpagedetails.viewmodel.PostPageHorizontalRecyclerViewModel
import com.example.testappexmpl.ui.postpagedetails.viewmodel.PostPageReviewRecyclerViewModel

class PostPageDetailsFragment : Fragment() {
    private val binding by lazy { FragmentPostPageDetailsBinding.inflate(layoutInflater) }
    private val args: PostPageDetailsFragmentArgs by navArgs()
    private val postPageLightViewModel: PostPageLightViewModel by viewModels()
    private val horizontalViewModel: PostPageHorizontalRecyclerViewModel by viewModels()
    private val gridViewModel: PostPageGridRecyclerViewModel by viewModels()
    private val reviewViewModel: PostPageReviewRecyclerViewModel by viewModels()
    private val horizontalRecyclerAdapter = PostPageHorizontalRecyclerAdapter()
    private val gridRecyclerAdapter = PostPageGridRecyclerAdapter()
    private val reviewRecyclerAdapter = PostPageReviewRecyclerAdapter()
    //    private val postPageDetailsAdapter = PostPageDetailsAdapter()
    //    private var postPageModelList = arrayListOf<PostPageLightModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        initToolbar()
        init()
        observeHorizontalList()
        observeGridList()
        observeReviewList()
        observePostPageLight()
        return binding.root
    }

    private fun initToolbar() {
        setHasOptionsMenu(true)
        (activity as AppCompatActivity).setSupportActionBar(binding.postPageToolbar)

        binding.postPageToolbar.setNavigationOnClickListener {
            activity?.onBackPressed()
            val imm = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view?.windowToken, 0)
        }
    }

    private fun init() {
        postPageLightViewModel.sendData(
            PostPageLightModel(
                args.postPageModel.image,
                args.postPageModel.pretitle,
                args.postPageModel.title,
                args.postPageModel.otherMembersCount,
                args.postPageModel.otherPostPageGridImageCount
            )
        )
        horizontalViewModel.sendHorizontalData(args.postPageModel.membersImageList!!)
        gridViewModel.sendGridData(args.postPageModel.postPageGridImageList!!)
        reviewViewModel.sendReviewData(args.postPageModel.reviewList!!)
    }

    private fun observeHorizontalList() {
        horizontalViewModel.horizontalRecyclerDataList.observe(viewLifecycleOwner, {
            horizontalRecyclerAdapter.submitList(it.toMutableList())
            binding.postPageHorizontalRv.adapter = horizontalRecyclerAdapter
        })
    }

    private fun observeGridList() {
        gridViewModel.gridRecyclerDataList.observe(viewLifecycleOwner, {
            gridRecyclerAdapter.submitList(it.toMutableList())
            binding.postPageGridRv.adapter = gridRecyclerAdapter
        })
    }

    private fun observeReviewList() {
        reviewViewModel.reviewRecyclerDataList.observe(viewLifecycleOwner, {
            reviewRecyclerAdapter.submitList(it.toMutableList())
            binding.postPageReviewVerticalRv.adapter = reviewRecyclerAdapter
        })
    }

    private fun observePostPageLight() {
        postPageLightViewModel.postPageLightData.observe(viewLifecycleOwner, {

//            PostPageDetailsAdapter().apply {
//                postPageModelList.add(it)
//                submitList(postPageModelList.toMutableList())
//            }

            binding.postPageCollapsingImageview.setImageResource(it.image!!)
            binding.postPagePretitle.text = it.pretitle
            binding.postPageTitle.text = it.title
            binding.otherMembersCount.text = it.otherMembersCount.toString()
            binding.otherGridImageCount.text = it.otherPostPageGridImageCount.toString()
        })
    }
}











