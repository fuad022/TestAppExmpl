package com.example.testappexmpl.ui.postpagedetails.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testappexmpl.data.model.PostPageHorizontalRecyclerItemModel
import com.example.testappexmpl.repository.DataRepository

class PostPageHorizontalRecyclerViewModel(private val dataRepository: DataRepository) : ViewModel() {
    private val _dataList = MutableLiveData<List<PostPageHorizontalRecyclerItemModel>>()
    val horizontalRecyclerDataList: LiveData<List<PostPageHorizontalRecyclerItemModel>> get() = _dataList

    fun sendHorizontalData(list: List<PostPageHorizontalRecyclerItemModel>) {
        _dataList.value = dataRepository.sendRepoHorizontalData(list)
    }
}