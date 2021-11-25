package com.example.testappexmpl.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProfileMainRVModel(
    val title: String,
    val list: List<ProfileNestedRVModel>
) : Parcelable