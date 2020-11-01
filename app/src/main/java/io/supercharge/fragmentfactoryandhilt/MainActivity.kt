package io.supercharge.fragmentfactoryandhilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.EntryPointAccessors
import io.supercharge.fragmentfactoryandhilt.app.ui.factory.DefaultFragmentFactoryEntryPoint
import io.supercharge.fragmentfactoryandhilt.navigator.Navigator
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var navigator: Navigator

    private lateinit var navHostFragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        val entryPoint =
            EntryPointAccessors.fromActivity(
                this,
                DefaultFragmentFactoryEntryPoint::class.java
            )

        supportFragmentManager.fragmentFactory = entryPoint.getFragmentFactory()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        navHostFragment =
            requireNotNull(supportFragmentManager.findFragmentById(R.id.fragmentContainer))

        val navController = navHostFragment.findNavController()

        navigator.navController = navController
    }

    override fun onBackPressed() {
        if (navHostFragment.childFragmentManager.backStackEntryCount > 0) {
            navigator.navigateBack()
        } else {
            finish()
        }
    }
}
