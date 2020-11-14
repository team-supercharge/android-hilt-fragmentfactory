package io.supercharge.fragmentfactoryandhilt.app.ui.factory

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import io.supercharge.fragmentfactoryandhilt.app.ui.FirstScreenFragment
import io.supercharge.fragmentfactoryandhilt.app.ui.SecondScreenFragment
import io.supercharge.fragmentfactoryandhilt.app.ui.ThirdScreenFragment
import io.supercharge.fragmentfactoryandhilt.navigator.Navigator
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

//class DefaultFragmentFactory @Inject constructor(
//    private val navigator: Navigator
//) : FragmentFactory() {
//
//    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
//        return when (className) {
//            FirstScreenFragment::class.java.name -> FirstScreenFragment(navigator)
//            SecondScreenFragment::class.java.name -> SecondScreenFragment(navigator)
//            ThirdScreenFragment::class.java.name -> ThirdScreenFragment(navigator)
//            else -> super.instantiate(classLoader, className)
//        }
//    }
//}

@Singleton
class DefaultFragmentFactory
@Inject constructor(
    private val providerMap: Map<Class<out Fragment>, @JvmSuppressWildcards Provider<Fragment>>
) : FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        val fragmentClass = loadFragmentClass(classLoader, className)

        val creator = providerMap[fragmentClass] ?: providerMap.entries.firstOrNull {
            fragmentClass.isAssignableFrom(it.key)
        }?.value

        return creator?.get() ?: super.instantiate(classLoader, className)
    }
}
