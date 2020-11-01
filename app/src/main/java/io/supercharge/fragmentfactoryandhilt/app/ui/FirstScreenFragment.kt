package io.supercharge.fragmentfactoryandhilt.app.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import io.supercharge.fragmentfactoryandhilt.R
import io.supercharge.fragmentfactoryandhilt.app.viewmodel.FirstScreenViewModel
import io.supercharge.fragmentfactoryandhilt.base.BaseFragment
import io.supercharge.fragmentfactoryandhilt.navigator.Navigator
import kotlinx.android.synthetic.main.fragment_first_screen.*
import javax.inject.Inject

@AndroidEntryPoint
class FirstScreenFragment : BaseFragment() {

    override val layoutId: Int = R.layout.fragment_first_screen

    private val viewModel: FirstScreenViewModel by viewModels()

    @Inject
    lateinit var navigator: Navigator

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        openSecondScreen.setOnClickListener {
            navigator.navigate(R.id.navDirectionSecondScreen)
        }

        viewModel.method()
    }
}
