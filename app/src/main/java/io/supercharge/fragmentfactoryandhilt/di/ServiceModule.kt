package io.supercharge.fragmentfactoryandhilt.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import io.supercharge.fragmentfactoryandhilt.app.service.CarService
import io.supercharge.fragmentfactoryandhilt.app.service.CarServiceImpl
import io.supercharge.fragmentfactoryandhilt.app.service.UserService
import io.supercharge.fragmentfactoryandhilt.app.service.UserServiceImpl

@Module
@InstallIn(ApplicationComponent::class)
abstract class ServiceModule {

    @Binds
    abstract fun bindUserService(service: UserServiceImpl): UserService

    @Binds
    abstract fun bindCarService(service: CarServiceImpl): CarService
}
