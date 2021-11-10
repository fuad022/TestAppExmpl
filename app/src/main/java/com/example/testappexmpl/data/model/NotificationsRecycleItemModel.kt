package com.example.testappexmpl.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class NotificationsRecycleItemModel(
    val image: Int,
    val actionComment: String
) : Parcelable