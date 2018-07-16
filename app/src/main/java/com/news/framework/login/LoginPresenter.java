package com.news.framework.login;

import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.View;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import java.util.Timer;
import java.util.TimerTask;

public class LoginPresenter implements LoginInterafce.presenter {
    LoginInterafce.view fragment;


    LoginPresenter(LoginInterafce.view fragment) {

        this.fragment = fragment;
    }

    public void manualLoginStatus(String username, String password) {

        /*native android method*/
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 100ms
                fragment.loginStatus("success");
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

    public void facebookLoginStatus(LoginButton facebookLoginButton, final LoginInterafce.view fragment) {

        /*facebook login button*/
        CallbackManager callbackManager = CallbackManager.Factory.create();
        facebookLoginButton.setFragment((Fragment) fragment);
        // Callback registration
        facebookLoginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                fragment.loginStatus("success");
            }

            @Override
            public void onCancel() {
                fragment.loginStatus("cancel");
            }

            @Override
            public void onError(FacebookException exception) {
                fragment.loginStatus("error");
            }
        });

    }

    public void gmainLoginStatus() {

        fragment.loginStatus("success");
    }
}
