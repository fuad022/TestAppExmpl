package com.example.testappexmpl.ui.postpagedetails.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testappexmpl.data.model.PostPageGridModel
import com.example.testappexmpl.repository.DataRepository

class PostPageGridViewModel(private val dataRepository: DataRepository) : ViewModel() {
    private val _dataList = MutableLiveData<List<PostPageGridModel>>()
    val gridRecyclerDataList: LiveData<List<PostPageGridModel>> get() = _dataList

    fun sendGridData(list: List<PostPageGridModel>) {
        _dataList.value = dataRepository.sendRepoGridData(list)
    }
}