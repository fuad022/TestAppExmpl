package com.example.testappexmpl.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PostPageGridModel(
    val image: Int
) : Parcelable