package com.example.testappexmpl.ui.home.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testappexmpl.data.mocklist.MockData.getHomeVerticalList
import com.example.testappexmpl.data.model.HomeVerticalRecyclerItemModel

class HomeVerticalRecyclerDataViewModel : ViewModel() {

    private val _mockDataList = MutableLiveData<List<HomeVerticalRecyclerItemModel>>()
    val mockDataList: LiveData<List<HomeVerticalRecyclerItemModel>> get() = _mockDataList

    init {
        _mockDataList.value = getHomeVerticalList()
    }
}