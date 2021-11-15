package com.example.testappexmpl.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.testappexmpl.R
import com.example.testappexmpl.databinding.FragmentFaceIdBinding

class FaceIdFragment : Fragment() {
    private val binding by lazy { FragmentFaceIdBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        init()
        return binding.root
    }

    private fun init() {
        binding.faceIdBtn.setOnClickListener {
            val action =
                FaceIdFragmentDirections.actionFaceIdFragmentToRootFragment()
            findNavController().navigate(action)
        }

        binding.loginBtn.setOnClickListener {
            val action = FaceIdFragmentDirections.actionFaceIdFragmentToLoginFragment()
            findNavController().navigate(action)
        }
    }
}