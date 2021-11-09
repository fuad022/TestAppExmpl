package com.example.testappexmpl.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PostPageHorizontalRecyclerItemModel(
    val memberImg: Int
) : Parcelable