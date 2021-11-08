package com.example.testappexmpl.ui.postpagedetails.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testappexmpl.data.model.HomeNestedGridRecyclerItemModel

class PostPageDetailsViewModel : ViewModel() {

    private val _postPageData = MutableLiveData<HomeNestedGridRecyclerItemModel>()
    val postPageDataList: LiveData<HomeNestedGridRecyclerItemModel> get() = _postPageData

    fun sendData(itemModel: HomeNestedGridRecyclerItemModel) {
        _postPageData.value = itemModel
    }
}