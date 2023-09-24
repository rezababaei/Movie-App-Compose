plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android")
    kotlin("kapt")
}

android {
    namespace = "com.core.network"
    compileSdk = 33

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(Deps.core)
    implementation(Deps.appCompat)
    implementation(CoroutinesLifecycleScope.lifeCycleRuntime)
    implementation(JetpackCompose.composeActivity)
    implementation(JetpackCompose.composeUi)
//    implementation(JetpackCompose.composeGraphics)
//    implementation(JetpackCompose.composeUiToolingPreview)
    implementation(JetpackCompose.composeMaterial)
    implementation(JetpackCompose.composeMaterial3)
    testImplementation(TestImplementation.junit)
    androidTestImplementation(AndroidTestImplementation.junit)
    androidTestImplementation(AndroidTestImplementation.espresso)

//    implementation(platform(JetpackCompose.platformComposeBom))
//    androidTestImplementation(platform(JetpackCompose.platformComposeBom))
//    androidTestImplementation(ComposeAndroidTestImplementation.composeUiTest)
//    debugImplementation(ComposeDebugImplementation.toolingUi)
//    debugImplementation(ComposeDebugImplementation.manifestTest)
    implementation(Retrofit.retrofit)
    implementation(Retrofit.okHttp)
    implementation(Retrofit.gsonConvertor)

    implementation(DaggerHilt.hilt)
    kapt(DaggerHilt.hiltCompiler)
//    ksp("androidx.room:room-compiler:2.5.0")


}


