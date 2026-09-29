# 실습 2 - 이미지 1장을 화면에 출력하는 안드로이드 앱

`res/drawable-nodpi/sample_image.png` 이미지를 `ImageView` 로 화면에 출력하는 앱입니다.
외부 라이브러리 없이 Android 기본 프레임워크(`Activity`, `ImageView`)만 사용했습니다.

| 파일 | 설명 |
|---|---|
| `app/src/main/java/kr/ac/khu/lab01/imageviewer/MainActivity.java` | 레이아웃을 화면에 설정하는 Activity |
| `app/src/main/res/layout/activity_main.xml` | 제목 + `ImageView` + 설명 텍스트 레이아웃 |
| `app/src/main/res/drawable-nodpi/sample_image.png` | 출력할 이미지 (1200×800) |
| `app/src/main/AndroidManifest.xml` | 앱 설정, 시작 Activity 등록 |
| `screenshots/app_running.png` | 에뮬레이터 실행 화면 캡처 |

- 언어: Java 11 / 빌드: Gradle 9.4.1, Android Gradle Plugin 9.2.1
- minSdk 24 (Android 7.0), targetSdk/compileSdk 36

## 실행 방법 (Android Studio)

1. Android Studio → **Open** → 이 폴더(`02_android_image_app`) 선택
2. Gradle Sync 완료 대기 (SDK 가 없으면 설치 안내가 뜨면 설치)
3. Device Manager 에서 가상 기기(예: Pixel, API 36) 생성
4. ▶ Run 'app'
