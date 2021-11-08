package com.example.testappexmpl.ui.home.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testappexmpl.data.mocklist.MockData.getHomeHorizontalList
import com.example.testappexmpl.data.model.HomeHorizontalRecyclerItemModel

class HomeHorizontalRecyclerDataViewModel : ViewModel() {

    private val _mockDataList = MutableLiveData<List<HomeHorizontalRecyclerItemModel>>()
    val mockDataList: LiveData<List<HomeHorizontalRecyclerItemModel>> get() = _mockDataList

    init {
        _mockDataList.value = getHomeHorizontalList()
    }
}