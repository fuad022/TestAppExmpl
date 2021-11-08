package com.example.testappexmpl.ui.postpagedetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.testappexmpl.R
import com.example.testappexmpl.databinding.FragmentPostPageDetailsBinding

class PostPageDetailsFragment : Fragment() {
    private val binding by lazy { FragmentPostPageDetailsBinding.inflate(layoutInflater) }
    private val args: PostPageDetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return binding.root
    }
}