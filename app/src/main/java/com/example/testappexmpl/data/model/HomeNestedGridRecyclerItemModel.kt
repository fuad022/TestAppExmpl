package com.example.testappexmpl.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class HomeNestedGridRecyclerItemModel(
    val image: Int?,
    val pretitle: String?,
    val title: String?,
    val membersImageList: List<Int>?,
    val otherMembersCount: Int?,
    val postPageGridImageList: List<Int>?,
    val otherPostPageGridImageCount: Int?,
    val reviewList: List<PostPageReviewItemModel>?
) : Parcelable