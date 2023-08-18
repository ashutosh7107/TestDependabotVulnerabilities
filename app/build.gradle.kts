import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.testdependabotvulnerabilities"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.testdependabotvulnerabilities"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.activity:activity-compose:1.7.0")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    //Android Jetpack Libraries
    api("androidx.cardview:cardview:1.0.0")
    api("androidx.core:core-ktx:1.9.0")
    api("androidx.constraintlayout:constraintlayout:2.1.4")
    api("androidx.exifinterface:exifinterface:1.3.6")
    api("androidx.fragment:fragment-ktx:1.5.6")
    api("androidx.lifecycle:lifecycle-common-java8:2.6.1")
    api("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    api("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
    api("androidx.lifecycle:lifecycle-process:2.6.1")
    api("androidx.lifecycle:lifecycle-viewmodel-savedstate:2.6.1")
    // Lifecycles only (without ViewModel or LiveData)
    api("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    api("androidx.navigation:navigation-ui-ktx:2.5.3")
    api("androidx.navigation:navigation-fragment-ktx:2.5.3")
    api("androidx.preference:preference-ktx:1.2.0")
    api("androidx.recyclerview:recyclerview:1.3.0")
    api("androidx.security:security-crypto:1.0.0")
    api("androidx.viewpager2:viewpager2:1.0.0")
    api("androidx.work:work-runtime:2.8.1")
    api("androidx.work:work-runtime-ktx:2.8.1")
    
    // Kaltura
    api("com.kaltura.playkit:playkit:4.28.0")
    api("com.kaltura.playkit:playkitproviders:4.28.0")
    implementation("androidx.hilt:hilt-work:1.0.0")
    implementation("com.google.dagger:hilt-android:2.45")
    // google's location service
    api("com.google.android.gms:play-services-location:21.0.1")

    //Hilt
    implementation("com.google.dagger:hilt-android:2.45")

    //Hilt Worker
    implementation("androidx.hilt:hilt-work:1.0.0")

    //Google Libraries
    implementation("com.google.accompanist:accompanist-navigation-animation:0.30.1")
    api("com.google.android.material:material:1.8.0")
    api("com.google.code.gson:gson:2.10.1")

    //Kotlin Extension Libraries
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:1.6.4")
    api("org.jetbrains.kotlinx:kotlinx-datetime:0.4.0")
    api("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.0")

    //Memory Leak Detection
    debugApi("com.squareup.leakcanary:leakcanary-android:2.10")
    //CMS Integration
    api("com.contentful.java:java-sdk:10.5.13")

    //SVG Rendering
    api("com.caverock:androidsvg-aar:1.4")

    //Image Handling & Animation
    api("com.github.bumptech.glide:glide:4.15.1")

    //Charting
    api("com.github.PhilJay:MPAndroidChart:v3.1.0")

    //Tool Tips
    api("com.github.douglasjunior:android-simple-tooltip:1.1.0")

    //Database Encryption
    api("net.zetetic:android-database-sqlcipher:4.5.3")

    //Logging
    api("com.jakewharton.timber:timber:5.0.1")

    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.10.0")

    //Room DB
    implementation("androidx.room:room-runtime:2.5.1")
    implementation("androidx.room:room-ktx:2.5.1")

    //Testing
    testImplementation("androidx.arch.core:core-testing:2.2.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    testImplementation("io.mockk:mockk:1.13.5")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
}