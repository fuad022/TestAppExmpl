package com.example.testappexmpl.ui.home.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testappexmpl.databinding.FragmentBottomSheetFilterBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetFilterFragment : BottomSheetDialogFragment() {
    private val binding by lazy { FragmentBottomSheetFilterBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding.closeFilterBtn.setOnClickListener {
            this.dismiss()
        }
//        binding.search.isEnabled = false
        return binding.root
    }

}