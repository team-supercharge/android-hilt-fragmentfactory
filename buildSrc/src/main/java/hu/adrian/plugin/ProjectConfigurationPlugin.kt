package hu.adrian.plugin

//import Dependencies
//import Versions
//import com.android.build.gradle.AppExtension
//import com.android.build.gradle.BaseExtension
//import com.android.build.gradle.LibraryExtension
//import com.android.build.gradle.api.BaseVariant
//import org.gradle.api.*
//import org.gradle.api.tasks.compile.JavaCompile
//import org.gradle.kotlin.dsl.configure
//import org.gradle.kotlin.dsl.dependencies
//import org.jetbrains.kotlin.gradle.internal.AndroidExtensionsExtension
//import org.jetbrains.kotlin.gradle.plugin.KaptExtension
//import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

//class ProjectConfigurationPlugin : Plugin<Project> {
//
//    @Suppress("LongMethod")
//    override fun apply(target: Project) {
//        target.allprojects {
//            tasks.withType(JavaCompile::class.java).forEach {
//                it.options.compilerArgs.addAll(listOf("-Xmaxerrs", Int.MAX_VALUE.toString()))
//            }
//
//            tasks.withType(KotlinCompile::class.java) {
//                kotlinOptions {
//                    jvmTarget = org.gradle.api.JavaVersion.VERSION_1_8.toString()
//                    freeCompilerArgs = freeCompilerArgs + "-Xuse-experimental=kotlinx.coroutines.ExperimentalCoroutinesApi"
//                }
//            }
//
//            group = "hu.adrian.app"
//            version = "0.0.1-SNAPSHOT"
//        }
//
//        target.configure(target.subprojects.filter { it.name != "domain" && it.name != "features" }) {
//            if (name == "app") {
//                plugins.apply("com.android.application")
//            } else {
//                plugins.apply("com.android.library")
//            }
//
//            plugins.apply("org.jetbrains.kotlin.android")
//            plugins.apply("org.jetbrains.kotlin.android.extensions")
//            plugins.apply("org.jetbrains.kotlin.kapt")
//            plugins.apply("dagger.hilt.android.plugin")
//
//            android {
////                compileSdkVersion(Versions.targetSdk)
//                compileSdkVersion(Versions.apiLevel)
//                buildToolsVersion(Versions.buildTools)
//
//                defaultConfig {
//                    minSdkVersion(Versions.minSdk)
//                    targetSdkVersion(Versions.targetSdk)
//
//                    versionCode = 1
//                    versionName = "1.0.0"
//
//                    vectorDrawables.setGeneratedDensities(kotlin.collections.emptyList())
//
//                    if (project.name != "app" && project.file("proguard-rules.pro").exists()) {
//                        consumerProguardFiles("proguard-rules.pro")
//                    }
//
//                    testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
//                }
//
//                compileOptions {
//                    sourceCompatibility = JavaVersion.VERSION_1_8
//                    targetCompatibility = JavaVersion.VERSION_1_8
//                }
//
////                kotlinOptions {
////                    jvmTarget = JavaVersion.VERSION_1_8.toString()
////                }
//
//                flavorDimensions("default")
//
//                productFlavors.configureEach {
//                    dimension = "default"
//
//                    sourceSets.getByName(name) {
//                        java.srcDir("src/$name/kotlin")
//                    }
//                }
//
//                buildTypes.configureEach {
//                    sourceSets.getByName(name) {
//                        java.srcDir("src/$name/kotlin")
//                    }
//                }
//
//                variants.all(object : Action<BaseVariant> {
//
//                    override fun execute(variant: BaseVariant) {
//                        sourceSets.getByName(variant.name) {
//                            java.srcDir("src/${variant.name}/kotlin")
//                        }
//                    }
//                })
//
//                packagingOptions.exclude("META-INF/main.kotlin_module")
//
//                // https://arturdryomov.dev/posts/kotlin-code-organization/
//                sourceSets {
//                    getByName("main").java.srcDirs("src/main/kotlin", "src/main/kotlinX")
//
//                    getByName("test").java.srcDirs("src/test/kotlin", "src/test/kotlinX", "src/testFixtures/kotlin")
//                }
//            }
//
//            dependencies {
//                add("implementation", Dependencies.Kotlin.kotlinStdlibJdk7)
//                add("implementation", Dependencies.Kotlin.kotlinStdlibJdk8)
//
//                add("implementation", Dependencies.Hilt.daggerHiltAndroid)
//                add("kapt", Dependencies.Hilt.daggerHiltAndroidCompiler)
//
//                add("implementation", Dependencies.Hilt.hiltLifecycleViewModel)
//                add("kapt", Dependencies.Hilt.hiltCompiler)
//            }
//
//            extensions.configure(KaptExtension::class.java) {
//                correctErrorTypes = true
//
//                javacOptions {
//                    option("-Xmaxerrs", Int.MAX_VALUE)
//                }
//            }
//        }
//
//        // TODO Not sure this is working, maybe I have to have an empty build.gradle.kts for the "features" module wrapper.
//        target.configure(target.subprojects.filter { it.parent?.name == "features" }) {
//            plugins.apply("org.jetbrains.kotlin.android.extensions")
//
//            android {
//                dataBinding {
//                    isEnabled = true
//                }
//            }
//
//            extensions.configure(AndroidExtensionsExtension::class.java) {
//                isExperimental = true
//            }
//        }
//    }
//}
//
//internal fun Project.android(action: BaseExtension.() -> Unit) = extensions.configure(action)
//
//val Project.variants: DomainObjectSet<out BaseVariant>
//    get() = if (plugins.hasPlugin("android-library")) {
//        extensions.getByType(LibraryExtension::class.java).libraryVariants
//    } else {
//        extensions.getByType(AppExtension::class.java).applicationVariants
//    }
