plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.rozetka.jetistorage"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.rozetka.jetistorage"
        minSdk = 27
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0.1"

    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("debug")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }

}

dependencies {
    implementation(platform(libs.koin.boom))
    implementation(libs.koin.core)
    implementation(libs.koin.android)
    implementation(libs.koin.coroutines)
    implementation(libs.koin.annotations)
    implementation(libs.koin.ksp.compiler)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(project(":core"))
    implementation(project(":uiComponents"))
    implementation(project(":dataStorage"))


}