package com.example.testappexmpl.ui.home.viewmodel

//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
////import com.example.testappexmpl.data.mocklist.MockData.getHomeVerticalList
//import com.example.testappexmpl.data.model.HomeVerticalRecyclerItemModel
//import com.example.testappexmpl.repository.DataRepository
//
//class HomeVerticalRecyclerDataViewModel(private val dataRepository: DataRepository) : ViewModel() {
//
//    private val _mockDataList = MutableLiveData<List<HomeVerticalRecyclerItemModel>>()
//    val mockDataList: LiveData<List<HomeVerticalRecyclerItemModel>> get() = _mockDataList
//
//    init {
//        _mockDataList.value = dataRepository.getRepoHomeVerticalList()
//    }
//}