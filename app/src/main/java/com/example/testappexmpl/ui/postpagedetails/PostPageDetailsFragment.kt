package com.example.testappexmpl.ui.postpagedetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.testappexmpl.databinding.FragmentPostPageDetailsBinding
import com.example.testappexmpl.ui.postpagedetails.viewmodel.PostPageDetailsViewModel

class PostPageDetailsFragment : Fragment() {
    private val binding by lazy { FragmentPostPageDetailsBinding.inflate(layoutInflater) }
    private val args: PostPageDetailsFragmentArgs by navArgs()
    private val postPageDetailsViewModel: PostPageDetailsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return binding.root
    }


}