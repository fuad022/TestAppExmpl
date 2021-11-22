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

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.postPageDetailsFragment -> hideBottomNav()
                else ->
                    showBottomNav()
            }
        }

//        val userProfileUrl =
//            "https://i.pinimg.com/originals/fd/1f/79/fd1f79bccedb91b28bebeaf2f84159f3.jpg"
//
//        binding.bottomNav.selectedItemId = R.id.home
//
//        binding.bottomNav.loadImage(
//            userProfileUrl, R.id.profile, R.drawable.ic_launcher_foreground
//        )
    }

    private fun hideBottomNav() {
        binding.bottomNav.visibility = View.GONE
    }

    private fun showBottomNav() {
        binding.bottomNav.visibility = View.VISIBLE
    }
}