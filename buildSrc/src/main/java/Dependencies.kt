object Versions {
    const val kotlinVersion                                      = "1.4.10"
    const val androidPluginVersion                               = "4.1.0"

    const val appCompat                                          = "1.1.0"
    const val constraintLayout                                   = "2.0.0-alpha3"
    const val navigationVersion                                  = "2.2.0"
    const val dagger                                             = "2.28.3"
    const val daggerHiltPlugin                                   = "2.28-alpha"
    const val hiltLifecycleViewModel                             = "1.0.0-alpha01"
}

object Dependencies {

    object Support {
        const val appCompat                 = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val constraintLayout          = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    }

    object Navigation {
        const val navigationFragment            = "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
        const val navigationUi                  = "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"
    }

    object Dagger {
        const val dagger                      = "com.google.dagger:dagger:${Versions.dagger}"
        const val daggerSupport               = "com.google.dagger:dagger-android-support:${Versions.dagger}"
        const val daggerCompiler              = "com.google.dagger:dagger-compiler:${Versions.dagger}"
        const val daggerAndroidProcessor      = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    }

    object Hilt {
        const val daggerHiltAndroid                      = "com.google.dagger:hilt-android:${Versions.daggerHiltPlugin}"
        const val daggerHiltAndroidCompiler              = "com.google.dagger:hilt-android-compiler:${Versions.daggerHiltPlugin}"
        const val hiltLifecycleViewModel                 = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltLifecycleViewModel}"
        const val hiltCompiler                           = "androidx.hilt:hilt-compiler:${Versions.hiltLifecycleViewModel}"
    }

    object ThirdParty {
        const val timber                           = "com.jakewharton.timber:timber:4.7.1"
    }
}
