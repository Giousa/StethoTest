package com.zmm.stethotest;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/5/23
 * Time:下午2:39
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
