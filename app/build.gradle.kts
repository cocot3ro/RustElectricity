import org.gradle.kotlin.dsl.android

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)

    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)

    alias(libs.plugins.google.services)
    alias(libs.plugins.firebase.crashlytics)

    alias(libs.plugins.jetbrains.kotlinx.serialization)
}

android {
    namespace = "com.cocot3ro.rustelectricity"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.cocot3ro.rustelectricity"
        minSdk = 29
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    buildFeatures {
        compose = true
        buildConfig = true
    }
}

kotlin.sourceSets.main {
    kotlin.srcDirs(
        file("${layout.buildDirectory.get().asFile}/generated/ksp/main/kotlin")
    )
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.kotlinx.serialization.json)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation(kotlin("reflect"))

    implementation(project(":annotations"))
    ksp(project(":processor"))

    // Firebase
    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.analytics)
    implementation(libs.firebase.crashlytics)

    // Corrutinas
    implementation(libs.kotlinx.coroutines.android)

    // OkHttp
    implementation(libs.okhttp)

    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.gson)

    // Dagger Hilt
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)
    implementation(libs.hilt.navigation.compose)

    // Room
    implementation(libs.androidx.room.ktx)
    ksp(libs.androidx.room.compiler)

    // Security
    implementation(libs.androidx.security.crypto)

    // Sqlcipher
    implementation(libs.android.database.sqlcipher)

    // DataStore
    implementation(libs.androidx.datastore.preferences)

    // Coil
    implementation(libs.coil.compose)

    implementation(libs.constraintlayout.compose)
}
