package com.example.testappexmpl.ui.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.testappexmpl.R
import com.example.testappexmpl.databinding.FragmentHomeBinding
import com.example.testappexmpl.ui.home.adapter.HomeHorizontalRecyclerAdapter
import com.example.testappexmpl.ui.home.adapter.HomeNestedGridRecyclerAdapter
import com.example.testappexmpl.ui.home.adapter.HomeVerticalRecyclerAdapter
import com.example.testappexmpl.ui.home.bottomsheet.BottomSheetFilterFragment
import com.example.testappexmpl.ui.home.viewmodel.HomeHorizontalRecyclerDataViewModel
import com.example.testappexmpl.ui.home.viewmodel.HomeVerticalRecyclerDataViewModel

class HomeFragment : Fragment() {
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }
    private val horizontalViewModel: HomeHorizontalRecyclerDataViewModel by viewModels()
    private val verticalViewModel: HomeVerticalRecyclerDataViewModel by viewModels()
    private val homeHorizontalRecyclerAdapter = HomeHorizontalRecyclerAdapter()
    private val homeVerticalRecyclerAdapter = HomeVerticalRecyclerAdapter()

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








