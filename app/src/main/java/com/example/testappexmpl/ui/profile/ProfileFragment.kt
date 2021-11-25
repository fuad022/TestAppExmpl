package com.example.testappexmpl.ui.profile

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.testappexmpl.R
import com.example.testappexmpl.databinding.FragmentProfileBinding
import com.example.testappexmpl.ui.profile.adapter.ProfileMainAdapter
import com.example.testappexmpl.ui.profile.viewmodel.ProfileViewModel
import com.example.testappexmpl.util.Util
import org.koin.androidx.viewmodel.ext.android.viewModel

class ProfileFragment : Fragment() {
    private val binding by lazy { FragmentProfileBinding.inflate(layoutInflater) }
    private val viewModel: ProfileViewModel by viewModel()
    private val profileMainAdapter = ProfileMainAdapter()

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
            profileMainAdapter.submitList(it.toMutableList())
        })
        binding.profileRv.adapter = profileMainAdapter
    }
}