package com.example.testappexmpl.ui.postpagedetails.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testappexmpl.data.model.PostPageMembersModel
import com.example.testappexmpl.repository.DataRepository

class PostPageMembersViewModel(private val dataRepository: DataRepository) : ViewModel() {
    private val _dataList = MutableLiveData<List<PostPageMembersModel>>()
    val horizontalRecyclerDataList: LiveData<List<PostPageMembersModel>> get() = _dataList

    fun sendHorizontalData(list: List<PostPageMembersModel>) {
        _dataList.value = dataRepository.sendRepoHorizontalData(list)
    }
}