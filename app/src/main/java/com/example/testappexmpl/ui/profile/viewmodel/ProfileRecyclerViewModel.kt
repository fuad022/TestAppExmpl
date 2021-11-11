package com.example.testappexmpl.ui.profile.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testappexmpl.data.mocklist.MockData.getProfileList
import com.example.testappexmpl.data.model.ProfileMainRecyclerItemModel

class ProfileRecyclerViewModel : ViewModel() {
    private val _mockDataList = MutableLiveData<List<ProfileMainRecyclerItemModel>>()
    val mockDataList: LiveData<List<ProfileMainRecyclerItemModel>> get() = _mockDataList

    init {
        _mockDataList.value = getProfileList()
    }
}