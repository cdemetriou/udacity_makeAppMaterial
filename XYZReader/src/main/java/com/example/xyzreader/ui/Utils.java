package com.example.xyzreader.ui;

import android.graphics.Color;
import android.os.Build;
import android.view.View;

/**
 * Created by christosdemetriou on 06/04/2018.
 */

public class Utils {

    public static void setStatusBar(ArticleListActivity myActivityReference){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            myActivityReference.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
            myActivityReference.getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
    }
}
