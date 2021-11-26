package com.example.testappexmpl.ui.postpagedetails

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.View.OnFocusChangeListener
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.navArgs
import com.example.testappexmpl.R
import com.example.testappexmpl.data.model.PostPageLightModel
import com.example.testappexmpl.databinding.FragmentPostPageDetailsBinding
import com.example.testappexmpl.ui.postpagedetails.adapter.PostPageGridAdapter
import com.example.testappexmpl.ui.postpagedetails.adapter.PostPageMembersAdapter
import com.example.testappexmpl.ui.postpagedetails.adapter.PostPageReviewAdapter
import com.example.testappexmpl.ui.postpagedetails.viewmodel.PostPageLightViewModel
import com.example.testappexmpl.ui.postpagedetails.viewmodel.PostPageGridViewModel
import com.example.testappexmpl.ui.postpagedetails.viewmodel.PostPageMembersViewModel
import com.example.testappexmpl.ui.postpagedetails.viewmodel.PostPageReviewViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class PostPageDetailsFragment : Fragment() {
    private val binding by lazy { FragmentPostPageDetailsBinding.inflate(layoutInflater) }
    private val args: PostPageDetailsFragmentArgs by navArgs()
    private val postPageLightViewModel: PostPageLightViewModel by viewModel()
    private val horizontalViewModel: PostPageMembersViewModel by viewModel()
    private val gridViewModel: PostPageGridViewModel by viewModel()
    private val reviewViewModel: PostPageReviewViewModel by viewModel()
    private val horizontalRecyclerAdapter = PostPageMembersAdapter()
    private val gridRecyclerAdapter = PostPageGridAdapter()
    private val reviewRecyclerAdapter = PostPageReviewAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        initToolbar()
        init()
        observeHorizontalList()
        observeGridList()
        observeReviewList()
        observePostPageLight()
//        binding.search.isEnabled = false
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTransparentStatusBar()
    }

    private fun setTransparentStatusBar() {
        requireActivity().window.decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR)
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireActivity(), R.color.white)
    }

    private fun initToolbar() {
        binding.toolbar.setNavigationOnClickListener {
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

        binding.nestedLayout.setOnTouchListener { view, motionEvent ->
            val imm = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view?.windowToken, 0)
        }
    }

    private fun observeHorizontalList() {
        horizontalViewModel.horizontalRecyclerDataList.observe(viewLifecycleOwner, {
            horizontalRecyclerAdapter.submitList(it.toMutableList())
        })
        binding.membersRv.adapter = horizontalRecyclerAdapter
    }

    private fun observeGridList() {
        gridViewModel.gridRecyclerDataList.observe(viewLifecycleOwner, {
            gridRecyclerAdapter.submitList(it.toMutableList())
        })
        binding.gridRv.adapter = gridRecyclerAdapter
    }

    private fun observeReviewList() {
        reviewViewModel.reviewRecyclerDataList.observe(viewLifecycleOwner, {
            reviewRecyclerAdapter.submitList(it.toMutableList())
        })
        binding.reviewRv.adapter = reviewRecyclerAdapter
    }

    private fun observePostPageLight() {
        postPageLightViewModel.postPageLightData.observe(viewLifecycleOwner, {
            binding.collapsingImage.setImageResource(it.image!!)
            binding.pretitle.text = it.pretitle
            binding.title.text = it.title
            binding.membersCount.text = "+" + it.otherMembersCount + " people in members"
            binding.cardCount.text = "+" + it.otherImageCount + " more"
        })
    }
}











