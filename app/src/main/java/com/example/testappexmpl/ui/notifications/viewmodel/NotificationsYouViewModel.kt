package com.example.testappexmpl.ui.notifications.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testappexmpl.data.mocklist.MockData.getNotifYouList
import com.example.testappexmpl.data.model.NotificationsRecycleItemModel

class NotificationsYouViewModel : ViewModel() {
    private val _mockDataList = MutableLiveData<List<NotificationsRecycleItemModel>>()
    val mockDataList: LiveData<List<NotificationsRecycleItemModel>> get() = _mockDataList

    init {
        _mockDataList.value = getNotifYouList()
    }
}