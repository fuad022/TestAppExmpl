package com.example.testappexmpl.ui.root

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.testappexmpl.R
import com.example.testappexmpl.databinding.FragmentRootBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class RootFragment : Fragment() {
    private val binding by lazy { FragmentRootBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        val navView: BottomNavigationView = binding.bottomNav

        val navController =
            Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_root)
        binding.bottomNav.setupWithNavController(navController)
        navView.itemIconTintList = null
    }
}