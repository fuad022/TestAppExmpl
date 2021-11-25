package com.example.testappexmpl.ui.root

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.TypedValue
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
import androidx.core.view.MenuItemCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition


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
            Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)
        binding.bottomNav.setupWithNavController(navController)
        navView.itemIconTintList = null

        val menu = binding.bottomNav.menu
        val menuItem = menu.findItem(R.id.profile)
        Glide.with(this)
            .asBitmap()
            .load(R.drawable.user_img_12)
            .apply(
                RequestOptions.circleCropTransform()
            ).into(object :
                CustomTarget<Bitmap>(dpToPx(24), dpToPx(24)) {
                override fun onResourceReady(resource: Bitmap, transition: Transition<in Bitmap>?) {
                    menuItem?.icon = BitmapDrawable(resources, resource)
                }

                override fun onLoadCleared(placeholder: Drawable?) {}
            })

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.postPageDetailsFragment -> hideBottomNav()
                else ->
                    showBottomNav()
            }
        }
    }

    private fun hideBottomNav() {
        binding.bottomNav.visibility = View.GONE
    }

    private fun showBottomNav() {
        binding.bottomNav.visibility = View.VISIBLE
    }

    fun dpToPx(dp: Int): Int {
        val r = context!!.resources
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            dp.toFloat(),
            r.displayMetrics
        )
            .toInt()
    }
}