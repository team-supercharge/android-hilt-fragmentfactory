plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
    id("kotlin-android")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdkVersion(30)

    defaultConfig {
        applicationId = "io.supercharge.fragmentfactoryandhilt"
        minSdkVersion(24)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    packagingOptions.exclude("META-INF/main.kotlin_module")
}

dependencies {
    // Support lib
    implementation(Dependencies.Support.appCompat)
    implementation(Dependencies.Support.constraintLayout)

    // Navigation
    implementation(Dependencies.Navigation.navigationFragment)
    implementation(Dependencies.Navigation.navigationUi)

    // dagger
    implementation(Dependencies.Dagger.dagger)
    implementation(Dependencies.Dagger.daggerSupport)
    kapt(Dependencies.Dagger.daggerCompiler)
    kapt(Dependencies.Dagger.daggerAndroidProcessor)

    // Hilt
    implementation(Dependencies.Hilt.daggerHiltAndroid)
    kapt(Dependencies.Hilt.daggerHiltAndroidCompiler)
    implementation(Dependencies.Hilt.hiltLifecycleViewModel)
    kapt(Dependencies.Hilt.hiltCompiler)

    implementation(Dependencies.ThirdParty.timber)
}
