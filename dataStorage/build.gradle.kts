plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.rozetka.datastorage"
    compileSdk = 35

    defaultConfig {
        minSdk = 27

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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }

}

dependencies {
    implementation(platform(libs.koin.boom))
    implementation(libs.koin.core)
    implementation(libs.koin.android)
    implementation(libs.koin.coroutines)
    implementation(libs.koin.annotations)
    implementation(libs.koin.ksp.compiler)
    implementation(libs.koin.logging)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.room)
    implementation(libs.room.ktx)
    implementation(libs.androidx.datastore.preferences)
    implementation(libs.androidx.datastore.preferences.core)

}