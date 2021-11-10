package com.example.testappexmpl.ui.notifications

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.testappexmpl.R
import com.example.testappexmpl.databinding.FragmentFollowingBinding
import com.example.testappexmpl.ui.notifications.adapter.NotificationsAdapter
import com.example.testappexmpl.ui.notifications.viewmodel.NotificationsFollowingViewModel

class FollowingFragment : Fragment() {
    private val binding by lazy { FragmentFollowingBinding.inflate(layoutInflater) }
    private val viewModel: NotificationsFollowingViewModel by viewModels()
    private val notificationAdapter = NotificationsAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        init()
        return binding.root
    }

    private fun init() {
        viewModel.mockDataList.observe(viewLifecycleOwner, {
            notificationAdapter.submitList(it.toMutableList())
            binding.followingNotifRv.adapter = notificationAdapter
        })
    }
}