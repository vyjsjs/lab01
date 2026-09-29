package kr.ac.khu.lab01.imageviewer;

import android.app.Activity;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;

/**
 * Lab01 - 이미지를 1장 화면에 출력하는 안드로이드 앱.
 * 이미지는 res/drawable-nodpi/sample_image.png 이며
 * res/layout/activity_main.xml 의 ImageView 에서 출력한다.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Android 15(API 35)+ 는 화면이 상태바/내비게이션바 뒤까지 그려지므로(edge-to-edge)
        // 시스템 바 크기만큼 여백을 줘서 제목과 이미지가 가려지지 않게 한다.
        View root = findViewById(R.id.root);
        root.setOnApplyWindowInsetsListener((v, insets) -> {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                Insets bars = insets.getInsets(WindowInsets.Type.systemBars());
                v.setPadding(bars.left, bars.top, bars.right, bars.bottom);
            } else {
                v.setPadding(insets.getSystemWindowInsetLeft(), insets.getSystemWindowInsetTop(),
                        insets.getSystemWindowInsetRight(), insets.getSystemWindowInsetBottom());
            }
            return insets;
        });
    }
}
