plugins {
    id (BuildPlugins.application)
    kotlin (BuildPlugins.kotlin)
}

android {
    compileSdk = AndroidConfig.compileSdkVersion

    defaultConfig {
        applicationId = AndroidConfig.applicationId
        minSdk = AndroidConfig.minSdkVersion
        targetSdk = AndroidConfig.targetSdkVersion
        versionCode = AndroidConfig.versionCode
        versionName = AndroidConfig.versionName

        testInstrumentationRunner = AndroidConfig.testRunner
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
//    implementation(project(":lib"))
    implementation (Dependencies.core)
    implementation (Dependencies.appCompat)
    implementation (Dependencies.materialDesign)
    implementation (Dependencies.constraintLayout)
    implementation (Dependencies.navigationFragment)
    implementation (Dependencies.navigationUI)

    testImplementation (TestDependencies.junit)
    androidTestImplementation (TestDependencies.junitExt)
    androidTestImplementation (TestDependencies.espresso)
}