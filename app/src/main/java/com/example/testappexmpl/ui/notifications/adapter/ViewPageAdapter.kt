package com.example.testappexmpl.ui.notifications.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.testappexmpl.ui.notifications.FollowingFragment
import com.example.testappexmpl.ui.notifications.YouFragment

class ViewPageAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                FollowingFragment()
            }
            1 -> {
                YouFragment()
            }
            else -> {
                Fragment()
            }
        }
    }
}