package io.supercharge.fragmentfactoryandhilt.app.ui

import android.os.Bundle
import android.view.View
import dagger.hilt.android.AndroidEntryPoint
import io.supercharge.fragmentfactoryandhilt.R
import io.supercharge.fragmentfactoryandhilt.base.BaseFragment
import io.supercharge.fragmentfactoryandhilt.navigator.Navigator
import kotlinx.android.synthetic.main.fragment_third_screen.*

@AndroidEntryPoint
class ThirdScreenFragment constructor(
    val navigator: Navigator
): BaseFragment() {

    override val layoutId: Int = R.layout.fragment_third_screen

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        back.setOnClickListener {
            navigator.navigateBack()
        }
    }
}
