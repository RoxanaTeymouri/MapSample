package com.roksanateimouri.sample.map.android.base.di

import com.roksanateimouri.sample.map.android.features.map.MapsViewModel
import com.roksanateimouri.sample.map.android.features.splash.SplashViewModel
import com.roksanateimouri.sample.map.android.features.vehiclelist.VehicleListViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Represents instance of all ViewModels and injects [com.roksanateimouri.sample.map.android.repository.DataRepository] in ViewModels.
 */
val viewModelModule = module {
    viewModel { SplashViewModel(get()) }
    viewModel { MapsViewModel(get()) }
    viewModel { VehicleListViewModel(get()) }
}
