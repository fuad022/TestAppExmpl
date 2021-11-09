package com.example.testappexmpl.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PostPageGridRecyclerItemModel(
    val image: Int
) : Parcelable