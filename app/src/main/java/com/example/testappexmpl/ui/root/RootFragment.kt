package com.example.testappexmpl.ui.root

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testappexmpl.R
import com.example.testappexmpl.databinding.FragmentRootBinding

class RootFragment : Fragment() {
    private val binding by lazy { FragmentRootBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return binding.root
    }

}