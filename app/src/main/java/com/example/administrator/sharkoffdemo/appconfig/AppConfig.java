package com.example.administrator.sharkoffdemo.appconfig;

import android.app.Application;

import com.zhy.autolayout.config.AutoLayoutConifg;

/**
 * Created by 卢冬冬 on 2016/5/7 0007.
 */
public class AppConfig extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AutoLayoutConifg.getInstance().useDeviceSize();
    }
}
