package io.supercharge.fragmentfactoryandhilt.app.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import io.supercharge.fragmentfactoryandhilt.R
import io.supercharge.fragmentfactoryandhilt.R.layout
import io.supercharge.fragmentfactoryandhilt.app.viewmodel.SecondScreenViewModel
import io.supercharge.fragmentfactoryandhilt.base.BaseFragment
import io.supercharge.fragmentfactoryandhilt.navigator.Navigator
import kotlinx.android.synthetic.main.fragment_second_screen.*

@AndroidEntryPoint
class SecondScreenFragment constructor(
    private val navigator: Navigator
) : BaseFragment() {

    override val layoutId: Int = layout.fragment_second_screen

    private val viewModel: SecondScreenViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        back.setOnClickListener {
            navigator.navigateBack()
        }

        openThirdScreen.setOnClickListener {
            navigator.navigate(R.id.navDirectionThirdScreen)
        }

        viewModel.method()
    }
}
