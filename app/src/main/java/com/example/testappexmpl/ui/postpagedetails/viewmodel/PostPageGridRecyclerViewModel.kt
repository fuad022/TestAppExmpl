package com.example.testappexmpl.ui.postpagedetails.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testappexmpl.data.model.PostPageGridRecyclerItemModel
import com.example.testappexmpl.repository.DataRepository

class PostPageGridRecyclerViewModel(private val dataRepository: DataRepository) : ViewModel() {
    private val _dataList = MutableLiveData<List<PostPageGridRecyclerItemModel>>()
    val gridRecyclerDataList: LiveData<List<PostPageGridRecyclerItemModel>> get() = _dataList

    fun sendGridData(list: List<PostPageGridRecyclerItemModel>) {
        _dataList.value = dataRepository.sendRepoGridData(list)
    }
}