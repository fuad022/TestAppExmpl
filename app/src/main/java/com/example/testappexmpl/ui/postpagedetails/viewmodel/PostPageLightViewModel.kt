package com.example.testappexmpl.ui.postpagedetails.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testappexmpl.data.model.PostPageLightModel
import com.example.testappexmpl.repository.DataRepository

class PostPageLightViewModel(private val dataRepository: DataRepository) : ViewModel() {
    private val _postPageLightData = MutableLiveData<PostPageLightModel>()
    val postPageLightData: LiveData<PostPageLightModel> get() = _postPageLightData

    fun sendData(itemModel: PostPageLightModel) {
        _postPageLightData.value = dataRepository.sendRepoData(itemModel)
    }
}