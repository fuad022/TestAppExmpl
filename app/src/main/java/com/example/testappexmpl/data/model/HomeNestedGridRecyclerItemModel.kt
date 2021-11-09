package com.example.testappexmpl.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class HomeNestedGridRecyclerItemModel(
    val image: Int?,
    val pretitle: String?,
    val title: String?,
    val membersImageList: List<PostPageHorizontalRecyclerItemModel>?,
    val otherMembersCount: Int?,
    val postPageGridImageList: List<PostPageGridRecyclerItemModel>?,
    val otherPostPageGridImageCount: Int?,
    val reviewList: List<PostPageReviewItemModel>?
) : Parcelable