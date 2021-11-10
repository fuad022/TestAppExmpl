package com.example.testappexmpl.ui.notifications

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.testappexmpl.databinding.FragmentYouBinding
import com.example.testappexmpl.ui.notifications.adapter.NotificationsAdapter
import com.example.testappexmpl.ui.notifications.viewmodel.NotificationsYouViewModel

class YouFragment : Fragment() {
    private val binding by lazy { FragmentYouBinding.inflate(layoutInflater) }
    private val viewModel: NotificationsYouViewModel by viewModels()
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