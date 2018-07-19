package com.news.framework;

import android.app.Activity;
import android.os.Handler;

import java.util.Timer;
import java.util.TimerTask;

public class Otherutils  {

    public void delayMethid() {
        /*native android method*/
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 100ms
                //fragment.loginStatus("success");
            }
        }, 2000);

        /*native java method*/
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                // this code will be executed after 2 seconds
            }
        }, 2000);

    }
}
