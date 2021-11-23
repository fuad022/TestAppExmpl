package com.example.testappexmpl.ui.notifications

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import com.example.testappexmpl.databinding.FragmentNotificationsBinding
import com.example.testappexmpl.ui.notifications.adapter.ViewPageAdapter
import com.example.testappexmpl.util.Util
import com.google.android.material.tabs.TabLayoutMediator

class NotificationsFragment : Fragment() {
    private val binding by lazy { FragmentNotificationsBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        initToolbar()
        init()
        Util.exitFullScreen(requireActivity())
        return binding.root
    }

    private fun initToolbar() {
        setHasOptionsMenu(true)
        (activity as AppCompatActivity).setSupportActionBar(binding.toolbar)

        binding.toolbar.setNavigationOnClickListener {
            activity?.onBackPressed()
            val imm = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view?.windowToken, 0)
        }
    }

    private fun init() {
        binding.apply {
            val adapter = ViewPageAdapter(activity?.supportFragmentManager!!, lifecycle)
            viewPager.adapter = adapter

            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                when (position) {
                    0 -> {
                        tab.text = "Following"
                    }
                    1 -> {
                        tab.text = "You"
                    }
                }
            }.attach()
        }
    }
}

























