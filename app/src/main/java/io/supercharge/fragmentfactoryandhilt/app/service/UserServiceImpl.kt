package io.supercharge.fragmentfactoryandhilt.app.service

import io.supercharge.fragmentfactoryandhilt.app.datastore.DataStore
import timber.log.Timber
import javax.inject.Inject

class UserServiceImpl @Inject constructor(
    private val dataStore: DataStore
) : UserService {

    override fun method() {
        Timber.e("UserService method called..")
    }
}
