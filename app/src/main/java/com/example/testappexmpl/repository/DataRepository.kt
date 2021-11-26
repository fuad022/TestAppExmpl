package com.example.testappexmpl.repository

import com.example.testappexmpl.data.mocklist.MockData
import com.example.testappexmpl.data.model.*

class DataRepository {
    fun getRepoHomeList(): List<HomeModel> = MockData.getHomeList()

    fun getRepoNotifFollowigList(): List<NotificationsModel> = MockData.getNotifFollowigList()
    fun getRepoNotifYouList(): List<NotificationsModel> = MockData.getNotifYouList()

    fun sendRepoGridData(list: List<PostPageGridModel>): List<PostPageGridModel> = list
    fun sendRepoHorizontalData(list: List<PostPageMembersModel>): List<PostPageMembersModel> = list
    fun sendRepoData(itemModel: PostPageLightModel): PostPageLightModel = itemModel
    fun sendRepoReviewData(list: List<PostPageReviewModel>): List<PostPageReviewModel> = list

    fun getRepoProfileList(): List<ProfileMainRVModel> = MockData.getProfileList()
}