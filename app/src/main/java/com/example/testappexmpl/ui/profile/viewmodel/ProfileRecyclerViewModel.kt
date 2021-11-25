package com.example.testappexmpl.ui.profile.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testappexmpl.data.model.ProfileMainRVModel
import com.example.testappexmpl.repository.DataRepository

class ProfileRecyclerViewModel(private val dataRepository: DataRepository) : ViewModel() {
    private val _mockDataList = MutableLiveData<List<ProfileMainRVModel>>()
    val mockDataList: LiveData<List<ProfileMainRVModel>> get() = _mockDataList

    init {
        _mockDataList.value = dataRepository.getRepoProfileList()
    }
}