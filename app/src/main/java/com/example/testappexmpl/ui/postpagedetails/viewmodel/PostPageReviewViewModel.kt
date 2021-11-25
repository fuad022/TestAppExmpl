package com.example.testappexmpl.ui.postpagedetails.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testappexmpl.data.model.PostPageReviewModel
import com.example.testappexmpl.repository.DataRepository

class PostPageReviewViewModel(private val dataRepository: DataRepository) : ViewModel() {
    private val _dataList = MutableLiveData<List<PostPageReviewModel>>()
    val reviewRecyclerDataList: LiveData<List<PostPageReviewModel>> get() = _dataList

    fun sendReviewData(list: List<PostPageReviewModel>) {
        _dataList.value = dataRepository.sendRepoReviewData(list)
    }
}