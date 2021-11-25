package com.example.testappexmpl.di

import com.example.testappexmpl.repository.DataRepository
//import com.example.testappexmpl.ui.home.viewmodel.HomeHorizontalRecyclerDataViewModel
//import com.example.testappexmpl.ui.home.viewmodel.HomeVerticalRecyclerDataViewModel
import com.example.testappexmpl.ui.home.viewmodel.HomeViewModel
import com.example.testappexmpl.ui.notifications.viewmodel.NotificationsFollowingViewModel
import com.example.testappexmpl.ui.notifications.viewmodel.NotificationsYouViewModel
import com.example.testappexmpl.ui.postpagedetails.viewmodel.PostPageGridViewModel
import com.example.testappexmpl.ui.postpagedetails.viewmodel.PostPageMembersViewModel
import com.example.testappexmpl.ui.postpagedetails.viewmodel.PostPageLightViewModel
import com.example.testappexmpl.ui.postpagedetails.viewmodel.PostPageReviewViewModel
import com.example.testappexmpl.ui.profile.viewmodel.ProfileRecyclerViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { DataRepository() }

//    viewModel { HomeHorizontalRecyclerDataViewModel(get()) }
//    viewModel { HomeVerticalRecyclerDataViewModel(get()) }
    viewModel { NotificationsFollowingViewModel(get()) }
    viewModel { NotificationsYouViewModel(get()) }
    viewModel { PostPageGridViewModel(get()) }
    viewModel { PostPageMembersViewModel(get()) }
    viewModel { PostPageLightViewModel(get()) }
    viewModel { PostPageReviewViewModel(get()) }
    viewModel { ProfileRecyclerViewModel(get()) }
    //
    viewModel { HomeViewModel(get()) }
    //
}