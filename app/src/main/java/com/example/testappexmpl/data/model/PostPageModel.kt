package com.example.testappexmpl.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PostPageModel(
    val image: Int?,
    val pretitle: String?,
    val title: String?,
    val membersImageList: List<PostPageMembersModel>?,
    val otherMembersCount: Int?,
    val postPageGridImageList: List<PostPageGridModel>?,
    val otherPostPageGridImageCount: Int?,
    val reviewList: List<PostPageReviewModel>?
) : Parcelable