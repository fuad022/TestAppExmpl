package com.example.testappexmpl.ui.postpagedetails

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
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
import org.koin.androidx.viewmodel.ext.android.viewModel

class PostPageDetailsFragment : Fragment() {
    private val binding by lazy { FragmentPostPageDetailsBinding.inflate(layoutInflater) }
    private val args: PostPageDetailsFragmentArgs by navArgs()
    private val postPageLightViewModel: PostPageLightViewModel by viewModel()
    private val horizontalViewModel: PostPageHorizontalRecyclerViewModel by viewModel()
    private val gridViewModel: PostPageGridRecyclerViewModel by viewModel()
    private val reviewViewModel: PostPageReviewRecyclerViewModel by viewModel()
    private val horizontalRecyclerAdapter = PostPageHorizontalRecyclerAdapter()
    private val gridRecyclerAdapter = PostPageGridRecyclerAdapter()
    private val reviewRecyclerAdapter = PostPageReviewRecyclerAdapter()

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
//        initRatingBar()
        return binding.root
    }

//    private fun initRatingBar() {
//        binding.postPageRatingBar.setOnRatingBarChangeListener { ratingBar, fl, b ->
//            Log.d("Rating", "rating")
//            binding.ratingBarMark.setText("$fl/5.0")
//        }
//    }

    private fun initToolbar() {
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
            binding.postPageCollapsingImageview.setImageResource(it.image!!)
            binding.postPagePretitle.text = it.pretitle
            binding.postPageTitle.text = it.title
            binding.plus.text = "+" + it.otherMembersCount + " people in members"
            binding.otherGridImageCount.text = it.otherPostPageGridImageCount.toString()
        })
    }
}











