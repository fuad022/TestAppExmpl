package com.example.testappexmpl.ui.home.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testappexmpl.data.model.HomeModel
import com.example.testappexmpl.repository.DataRepository

class HomeViewModel(private val dataRepository: DataRepository) : ViewModel() {
    private val _mockDataList = MutableLiveData<List<HomeModel>>()
    val mockDataList: LiveData<List<HomeModel>> get() = _mockDataList

    init {
        _mockDataList.value = dataRepository.getRepoHomeList()
    }
}