package com.example.testappexmpl.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PostPageReviewModel(
    val reviewProfileImage: Int,
    val reviewFullName: String,
    val reviewComment: String
) : Parcelable