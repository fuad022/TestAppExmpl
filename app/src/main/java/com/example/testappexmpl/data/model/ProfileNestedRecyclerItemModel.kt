package com.example.testappexmpl.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProfileNestedRecyclerItemModel(
    val image: Int,
    val cardName: String,
    val cardDescription: String,
    val event: String
) : Parcelable