package com.example.testappexmpl.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testappexmpl.databinding.FragmentHomeBinding
import com.example.testappexmpl.ui.home.adapter.HomeHorzAdapter
import com.example.testappexmpl.ui.home.adapter.HomeVertAdapter
import com.example.testappexmpl.ui.home.bottomsheet.BottomSheetFilterFragment
import com.example.testappexmpl.ui.home.viewmodel.HomeViewModel
import com.example.testappexmpl.util.Util
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }
    private val homeViewModel: HomeViewModel by viewModel()
    private val homeHorizontalRecyclerAdapter = HomeHorzAdapter()
    private val homeVerticalRecyclerAdapter = HomeVertAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        observeHorizontalList()
        observeVerticalList()
        initBtn()
        Util.exitFullScreen(requireActivity())
        return binding.root
    }

    private fun observeHorizontalList() {
        homeViewModel.mockDataList.observe(viewLifecycleOwner) {
            homeHorizontalRecyclerAdapter.submitList(it.filter {
                it.image != null || it.horzTitle != null
            })
        }
        binding.horizontalRv.adapter = homeHorizontalRecyclerAdapter
    }

    private fun observeVerticalList() {
        homeViewModel.mockDataList.observe(viewLifecycleOwner) {
            homeVerticalRecyclerAdapter.submitList(it.filter {
                it.vertTitle != null || it.list != null || it.titleBtn != null
            })
        }
        binding.verticalRv.adapter = homeVerticalRecyclerAdapter
    }

    private fun initBtn() {
        binding.filterBtn.setOnClickListener {
            BottomSheetFilterFragment().show(activity?.supportFragmentManager!!, "BottomSheetDialog")
        }
    }
}








