package com.news.framework.login;

import com.facebook.login.widget.LoginButton;

public interface LoginInterafce {

    public interface view {
        public void initViews();

        void loginStatus(String status);

    }

    public interface model {

    }

    public interface presenter {
       void manualLoginStatus(String username, String password);
        void facebookLoginStatus(LoginButton facebookLoginButton, final LoginInterafce.view fragment);
        void gmainLoginStatus();
    }
}
