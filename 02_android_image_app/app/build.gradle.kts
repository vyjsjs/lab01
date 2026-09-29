plugins {
    id("com.android.application")
}

android {
    namespace = "kr.ac.khu.lab01.imageviewer"
    compileSdk = 36

    defaultConfig {
        applicationId = "kr.ac.khu.lab01.imageviewer"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

// 외부 라이브러리 없이 Android 기본 프레임워크(Activity, ImageView)만 사용
