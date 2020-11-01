buildscript {
    val kotlinVersion = Versions.kotlinVersion
    val androidPluginVersion = Versions.androidPluginVersion
    val daggerHiltPlugin = Versions.daggerHiltPlugin

    repositories {
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:${androidPluginVersion}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("com.google.dagger:hilt-android-gradle-plugin:$daggerHiltPlugin")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven("https://jitpack.io")
    }
}
