package com.example.testappexmpl.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.testappexmpl.R
import com.example.testappexmpl.databinding.FragmentHomeBinding
import com.example.testappexmpl.ui.home.adapter.HomeHorizontalRecyclerAdapter
import com.example.testappexmpl.ui.home.viewmodel.HomeHorizontalRecyclerDataViewModel
import com.example.testappexmpl.ui.home.viewmodel.HomeVerticalRecyclerDataViewModel

class HomeFragment : Fragment() {
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }
    private val viewModel: HomeHorizontalRecyclerDataViewModel by viewModels()
    private val homeHorizontalRecyclerAdapter = HomeHorizontalRecyclerAdapter()
    private val homeVerticalRecyclerAdapter = HomeVerticalRecyclerDataViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        setupHorizontalRV()
        return binding.root
    }

    private fun setupHorizontalRV() {
        viewModel.mockDataList.observe(viewLifecycleOwner, {
            homeHorizontalRecyclerAdapter.submitList(it.toMutableList())
            binding.homeHorizontalRv.adapter = homeHorizontalRecyclerAdapter
        })
    }

}








