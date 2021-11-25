package com.example.testappexmpl.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PostPageLightModel(
    val image: Int?,
    val pretitle: String?,
    val title: String?,
    val otherMembersCount: Int?,
    val otherImageCount: Int?
) : Parcelable