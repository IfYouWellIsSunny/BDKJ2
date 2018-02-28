package com.example.dell.bdkj;

import android.app.Application;
import android.os.Debug;

import com.tencent.bugly.Bugly;

/**
 * Created by lenovo on 2018/2/27.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Bugly.init(getApplicationContext(), "0749307b90", false);
    }
}
