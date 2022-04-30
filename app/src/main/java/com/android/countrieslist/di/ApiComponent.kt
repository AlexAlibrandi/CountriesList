package com.android.countrieslist.di

import com.android.countrieslist.model.CountriesService
import com.android.countrieslist.viewmodel.ListViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service : CountriesService)

    fun inject(viewModel: ListViewModel)
}