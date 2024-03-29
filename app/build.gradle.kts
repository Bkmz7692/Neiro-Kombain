plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.neirocombain"
    compileSdk = 34


    defaultConfig {
        applicationId = "com.bkmzdev.neirocombain"
        minSdk = 26
        targetSdk = 33
        versionCode = 13
        versionName = "1.1.6"

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    lintOptions {
        disable("MobileAdsSdkOutdatedVersion")
    }
}

dependencies {
    implementation("io.appmetrica.analytics:analytics:6.1.0")
    implementation("com.google.code.gson:gson:2.8.5")
    implementation("com.squareup.picasso:picasso:2.5.2")
    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation("com.yandex.android:mobileads:6.2.0")
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.play:app-update-ktx:2.1.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    implementation("com.google.firebase:firebase-messaging:20.1.0")
}