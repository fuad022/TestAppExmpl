package com.example.testappexmpl.ui.profile

import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import com.example.testappexmpl.R
import com.example.testappexmpl.databinding.FragmentProfileBinding
import com.example.testappexmpl.ui.profile.adapter.ProfileMainRecyclerAdapter
import com.example.testappexmpl.ui.profile.viewmodel.ProfileRecyclerViewModel
import com.example.testappexmpl.util.Util
import org.koin.androidx.viewmodel.ext.android.viewModel

class ProfileFragment : Fragment() {
    private val binding by lazy { FragmentProfileBinding.inflate(layoutInflater) }
    private val viewModel: ProfileRecyclerViewModel by viewModel()
    private val profileMainRecyclerAdapter = ProfileMainRecyclerAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        observeList()
        Util.exitFullScreen(requireActivity())
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.profile_menu, menu)
    }

    private fun observeList() {
        viewModel.mockDataList.observe(viewLifecycleOwner, {
            profileMainRecyclerAdapter.submitList(it.toMutableList())
        })
        binding.profileRv.adapter = profileMainRecyclerAdapter
    }
}