package com.example.testappexmpl.util

import android.app.Activity
import android.graphics.Color
import android.os.Build
import android.view.View

class Util {
    companion object {
        fun exitFullScreen(activity: Activity) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                activity.window.decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR)
            }
        }

        fun setTransparentStatusBar(activity: Activity) {
            activity.window.decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            activity.window.statusBarColor = Color.TRANSPARENT
        }
    }
}