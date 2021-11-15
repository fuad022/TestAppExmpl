package com.example.testappexmpl.ui.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.example.testappexmpl.R
import com.example.testappexmpl.data.model.HomeHorizontalRecyclerItemModel
import com.example.testappexmpl.databinding.FragmentHomeBinding
import com.example.testappexmpl.ui.home.adapter.HomeHorizontalRecyclerAdapter
import com.example.testappexmpl.ui.home.adapter.HomeVerticalRecyclerAdapter
import com.example.testappexmpl.ui.home.bottomsheet.BottomSheetFilterFragment
import com.example.testappexmpl.ui.home.viewmodel.HomeHorizontalRecyclerDataViewModel
import com.example.testappexmpl.ui.home.viewmodel.HomeVerticalRecyclerDataViewModel
import com.example.testappexmpl.util.Util
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }
    private val horizontalViewModel: HomeHorizontalRecyclerDataViewModel by viewModel()
    private val verticalViewModel: HomeVerticalRecyclerDataViewModel by viewModel()
    private val homeHorizontalRecyclerAdapter = HomeHorizontalRecyclerAdapter()
    private val homeVerticalRecyclerAdapter = HomeVerticalRecyclerAdapter()
    private val homeHorizontalList = arrayListOf<HomeHorizontalRecyclerItemModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        binding.search.setupClearButtonWithAction()
        binding.search.isEnabled = false
        observeHorizontalList()
        observeVerticalList()
        initBtn()
        Util.exitFullScreen(requireActivity())
        return binding.root
    }

    @SuppressLint("ClickableViewAccessibility")
    fun EditText.setupClearButtonWithAction() {
        addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(ed: Editable?) {
                filter(ed.toString())
                val clearIcon = if (ed?.isNotEmpty() == true) R.drawable.ic_clear else 0
                setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_search_new, 0, clearIcon, 0)
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) = Unit
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) = Unit
        })

        setOnTouchListener(View.OnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                if (event.rawX >= (this.right - this.compoundPaddingRight)) {
                    this.setText("")
                    return@OnTouchListener true
                }
            }
            return@OnTouchListener false
        })
    }

    private fun filter(text: String) {
        val filteredHomeHorizontalList = arrayListOf<HomeHorizontalRecyclerItemModel>()
        homeHorizontalList.forEach {
            if (text.lowercase() in it.title.lowercase())
                filteredHomeHorizontalList.add(it)
            homeHorizontalRecyclerAdapter.submitList(filteredHomeHorizontalList.toMutableList())
        }
    }

    private fun observeHorizontalList() {
        horizontalViewModel.mockDataList.observe(viewLifecycleOwner, {
            homeHorizontalList.addAll(it)
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








