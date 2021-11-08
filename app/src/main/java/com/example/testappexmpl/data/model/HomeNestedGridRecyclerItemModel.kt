package com.example.testappexmpl.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class HomeNestedGridRecyclerItemModel(
    //TODO
    val image: Int,
    val pretitle: String,
    val title: String
) : Parcelable