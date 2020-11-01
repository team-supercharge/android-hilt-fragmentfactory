package io.supercharge.fragmentfactoryandhilt.app.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import io.supercharge.fragmentfactoryandhilt.base.BaseViewModel
import io.supercharge.fragmentfactoryandhilt.app.service.UserService

class FirstScreenViewModel @ViewModelInject constructor(
    private val userService: UserService
) : BaseViewModel() {

    fun method() {
        userService.method()
    }
}
