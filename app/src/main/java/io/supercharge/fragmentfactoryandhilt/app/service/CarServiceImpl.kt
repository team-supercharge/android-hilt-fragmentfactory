package io.supercharge.fragmentfactoryandhilt.app.service

import io.supercharge.fragmentfactoryandhilt.app.datastore.DataStore
import timber.log.Timber
import javax.inject.Inject

class CarServiceImpl @Inject constructor(
    private val dataStore: DataStore
) : CarService {

    override fun method() {
        Timber.e("CarService method called..")
    }
}
