package io.supercharge.fragmentfactoryandhilt.app.ui

import android.os.Bundle
import android.view.View
import dagger.hilt.android.AndroidEntryPoint
import io.supercharge.fragmentfactoryandhilt.R
import io.supercharge.fragmentfactoryandhilt.base.BaseFragment
import io.supercharge.fragmentfactoryandhilt.navigator.Navigator
import kotlinx.android.synthetic.main.fragment_third_screen.*
import javax.inject.Inject

@AndroidEntryPoint
class ThirdScreenFragment : BaseFragment() {

    override val layoutId: Int = R.layout.fragment_third_screen

    @Inject
    lateinit var navigator: Navigator

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        back.setOnClickListener {
            navigator.navigateBack()
        }
    }
}
