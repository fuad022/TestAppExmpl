package com.example.testappexmpl.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProfileMainRecyclerItemModel(
    val title: String,
    val list: List<ProfileNestedRecyclerItemModel>
) : Parcelable