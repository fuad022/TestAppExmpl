package com.example.testappexmpl.ui.postpagedetails.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testappexmpl.data.model.PostPageLightModel

class PostPageDetailsViewModel : ViewModel() {
    private val _postPageLightData = MutableLiveData<PostPageLightModel>()
    val postPageLightDataList: LiveData<PostPageLightModel> get() = _postPageLightData

    fun sendData(itemModel: PostPageLightModel) {
        _postPageLightData.value = itemModel
    }
}