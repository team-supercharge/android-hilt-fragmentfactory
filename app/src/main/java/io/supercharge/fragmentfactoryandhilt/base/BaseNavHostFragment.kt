package io.supercharge.fragmentfactoryandhilt.base

import android.content.Context
import androidx.navigation.fragment.NavHostFragment
import dagger.hilt.android.AndroidEntryPoint
import io.supercharge.fragmentfactoryandhilt.app.ui.factory.DefaultFragmentFactory
import javax.inject.Inject

@AndroidEntryPoint
class BaseNavHostFragment : NavHostFragment() {

    @Inject
    lateinit var fragmentFactory: DefaultFragmentFactory

    override fun onAttach(context: Context) {
        super.onAttach(context)

        childFragmentManager.fragmentFactory = fragmentFactory
    }
}
