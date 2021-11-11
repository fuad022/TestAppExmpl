package com.example.testappexmpl.ui.profile

import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.viewModels
import com.example.testappexmpl.R
import com.example.testappexmpl.databinding.FragmentProfileBinding
import com.example.testappexmpl.ui.profile.adapter.ProfileMainRecyclerAdapter
import com.example.testappexmpl.ui.profile.viewmodel.ProfileRecyclerViewModel

class ProfileFragment : Fragment() {
    private val binding by lazy { FragmentProfileBinding.inflate(layoutInflater) }
    private val viewModel: ProfileRecyclerViewModel by viewModels()
    private val profileMainRecyclerAdapter = ProfileMainRecyclerAdapter()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        initToolbar()
        observeList()
        return binding.root
    }

    private fun initToolbar() {
        setHasOptionsMenu(true)
        (activity as AppCompatActivity).setSupportActionBar(binding.profileToolbar)
        (activity as AppCompatActivity).supportActionBar?.setDisplayShowTitleEnabled(false)

        binding.profileToolbar.setNavigationOnClickListener {
            activity?.onBackPressed()
            val imm = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view?.windowToken, 0)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.profile_menu, menu)
    }

    private fun observeList() {
        viewModel.mockDataList.observe(viewLifecycleOwner, {
            profileMainRecyclerAdapter.submitList(it.toMutableList())
            binding.profileRv.adapter = profileMainRecyclerAdapter
        })
    }
}