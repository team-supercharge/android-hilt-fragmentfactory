package io.supercharge.fragmentfactoryandhilt.di

import androidx.fragment.app.Fragment
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.multibindings.IntoMap
import io.supercharge.fragmentfactoryandhilt.app.ui.FirstScreenFragment
import io.supercharge.fragmentfactoryandhilt.app.ui.SecondScreenFragment
import io.supercharge.fragmentfactoryandhilt.app.ui.ThirdScreenFragment

@Module
@InstallIn(ApplicationComponent::class)
abstract class FragmentFactoryModule {

//    @Binds
//    abstract fun bindFragmentFactory(factory: DefaultFragmentFactory): FragmentFactory

    @Binds
    @IntoMap
    @FragmentKey(FirstScreenFragment::class)
    abstract fun bindFirstScreenFragment(fragment: FirstScreenFragment): Fragment

    @Binds
    @IntoMap
    @FragmentKey(SecondScreenFragment::class)
    abstract fun bindSecondScreenFragment(fragment: SecondScreenFragment): Fragment

    @Binds
    @IntoMap
    @FragmentKey(ThirdScreenFragment::class)
    abstract fun bindThirdScreenFragment(fragment: ThirdScreenFragment): Fragment
}
