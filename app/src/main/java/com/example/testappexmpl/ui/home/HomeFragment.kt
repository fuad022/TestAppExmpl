package com.example.testappexmpl.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testappexmpl.databinding.FragmentHomeBinding
import com.example.testappexmpl.ui.home.adapter.HomeHorizontalRecyclerAdapter
import com.example.testappexmpl.ui.home.adapter.HomeVerticalRecyclerAdapter
import com.example.testappexmpl.ui.home.bottomsheet.BottomSheetFilterFragment
import com.example.testappexmpl.ui.home.viewmodel.HomeHorizontalRecyclerDataViewModel
import com.example.testappexmpl.ui.home.viewmodel.HomeVerticalRecyclerDataViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }
    private val horizontalViewModel: HomeHorizontalRecyclerDataViewModel by viewModel()
    private val verticalViewModel: HomeVerticalRecyclerDataViewModel by viewModel()
    private val homeHorizontalRecyclerAdapter = HomeHorizontalRecyclerAdapter()
    private val homeVerticalRecyclerAdapter = HomeVerticalRecyclerAdapter()
    private val usersList = arrayListOf<HomeHorizontalRecyclerDataViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        observeHorizontalList()
        observeVerticalList()
        initBtn()
        return binding.root
    }

    private fun observeHorizontalList() {
        horizontalViewModel.mockDataList.observe(viewLifecycleOwner, {
            homeHorizontalRecyclerAdapter.submitList(it)
        })
        binding.homeHorizontalRv.adapter = homeHorizontalRecyclerAdapter
    }

    private fun observeVerticalList() {
        verticalViewModel.mockDataList.observe(viewLifecycleOwner, {
            homeVerticalRecyclerAdapter.submitList(it)
        })
        binding.homeVerticalRv.adapter = homeVerticalRecyclerAdapter
    }

    private fun initBtn() {
        binding.filterBtn.setOnClickListener {
            BottomSheetFilterFragment().show(activity?.supportFragmentManager!!, "BottomSheetDialog")
        }
    }
}








