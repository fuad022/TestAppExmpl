package com.example.testappexmpl.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class HomeVerticalRecyclerItemModel(
    val title: String,
    val list: List<HomeNestedGridRecyclerItemModel>,
    val titleBtn: String
) : Parcelable