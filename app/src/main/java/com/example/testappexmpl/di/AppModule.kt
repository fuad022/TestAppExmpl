package com.example.testappexmpl.di

import com.example.testappexmpl.repository.DataRepository
//import com.example.testappexmpl.ui.home.viewmodel.HomeHorizontalRecyclerDataViewModel
//import com.example.testappexmpl.ui.home.viewmodel.HomeVerticalRecyclerDataViewModel
import com.example.testappexmpl.ui.home.viewmodel.HomeViewModel
import com.example.testappexmpl.ui.notifications.viewmodel.NotificationsFollowingViewModel
import com.example.testappexmpl.ui.notifications.viewmodel.NotificationsYouViewModel
import com.example.testappexmpl.ui.postpagedetails.viewmodel.PostPageGridRecyclerViewModel
import com.example.testappexmpl.ui.postpagedetails.viewmodel.PostPageHorizontalRecyclerViewModel
import com.example.testappexmpl.ui.postpagedetails.viewmodel.PostPageLightViewModel
import com.example.testappexmpl.ui.postpagedetails.viewmodel.PostPageReviewRecyclerViewModel
import com.example.testappexmpl.ui.profile.viewmodel.ProfileRecyclerViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { DataRepository() }

//    viewModel { HomeHorizontalRecyclerDataViewModel(get()) }
//    viewModel { HomeVerticalRecyclerDataViewModel(get()) }
    viewModel { NotificationsFollowingViewModel(get()) }
    viewModel { NotificationsYouViewModel(get()) }
    viewModel { PostPageGridRecyclerViewModel(get()) }
    viewModel { PostPageHorizontalRecyclerViewModel(get()) }
    viewModel { PostPageLightViewModel(get()) }
    viewModel { PostPageReviewRecyclerViewModel(get()) }
    viewModel { ProfileRecyclerViewModel(get()) }
    //
    viewModel { HomeViewModel(get()) }
    //
}