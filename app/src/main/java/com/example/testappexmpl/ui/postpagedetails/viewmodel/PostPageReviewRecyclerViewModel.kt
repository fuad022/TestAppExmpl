package com.example.testappexmpl.ui.postpagedetails.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testappexmpl.data.model.PostPageReviewItemModel
import com.example.testappexmpl.repository.DataRepository

class PostPageReviewRecyclerViewModel(private val dataRepository: DataRepository) : ViewModel() {
    private val _dataList = MutableLiveData<List<PostPageReviewItemModel>>()
    val reviewRecyclerDataList: LiveData<List<PostPageReviewItemModel>> get() = _dataList

    fun sendReviewData(list: List<PostPageReviewItemModel>) {
        _dataList.value = dataRepository.sendRepoReviewData(list)
    }
}