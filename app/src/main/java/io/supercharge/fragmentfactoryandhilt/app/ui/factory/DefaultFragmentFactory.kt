package io.supercharge.fragmentfactoryandhilt.app.ui.factory

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import io.supercharge.fragmentfactoryandhilt.app.ui.FirstScreenFragment
import io.supercharge.fragmentfactoryandhilt.app.ui.SecondScreenFragment
import io.supercharge.fragmentfactoryandhilt.app.ui.ThirdScreenFragment
import io.supercharge.fragmentfactoryandhilt.navigator.Navigator
import javax.inject.Inject

class DefaultFragmentFactory @Inject constructor(
    val navigator: Navigator
) : FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when (className) {
            FirstScreenFragment::class.java.name -> FirstScreenFragment(navigator)
            SecondScreenFragment::class.java.name -> SecondScreenFragment(navigator)
            ThirdScreenFragment::class.java.name -> ThirdScreenFragment(navigator)
            else -> super.instantiate(classLoader, className)
        }
    }
}
