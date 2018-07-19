package com.news.framework.login;

import android.content.Context;

import com.facebook.login.widget.LoginButton;

public interface LoginInterafce {

    public interface view {

        public void initViews();

        void loginStatus(String status);

    }

    public interface model {

        void saveDatalocally(Context fragment, String username, String password);
    }

    public interface presenter {

        void manualLoginStatus(Context activity, String username, String password);

        void facebookLoginStatus(LoginButton facebookLoginButton, final LoginInterafce.view fragment);

        void gmainLoginStatus();


    }
}
