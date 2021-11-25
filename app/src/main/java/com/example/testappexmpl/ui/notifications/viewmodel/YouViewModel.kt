package com.example.testappexmpl.ui.notifications.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testappexmpl.data.model.NotificationsModel
import com.example.testappexmpl.repository.DataRepository

class YouViewModel(private val dataRepository: DataRepository) : ViewModel() {
    private val _mockDataList = MutableLiveData<List<NotificationsModel>>()
    val mockDataList: LiveData<List<NotificationsModel>> get() = _mockDataList

    init {
        _mockDataList.value = dataRepository.getRepoNotifYouList()
    }
}