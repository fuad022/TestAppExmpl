package com.example.testappexmpl.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class HomeModel(
    //Horizontal
    val image: Int?,
    val horzTitle: String?,
    //Vertical
    val vertTitle: String?,
    val list: List<PostPageModel>?,
    val titleBtn: String?
) : Parcelable