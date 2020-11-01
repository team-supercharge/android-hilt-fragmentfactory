package io.supercharge.fragmentfactoryandhilt.app.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import io.supercharge.fragmentfactoryandhilt.base.BaseViewModel
import io.supercharge.fragmentfactoryandhilt.app.service.CarService

class SecondScreenViewModel @ViewModelInject constructor(
    private val carService: CarService
) : BaseViewModel() {

    fun method() {
        carService.method()
    }
}