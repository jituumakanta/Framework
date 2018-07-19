package com.news.framework.register;

import com.facebook.login.widget.LoginButton;
import com.news.framework.login.LoginInterafce;

public interface RegisterInterface {

    public interface view {
        void registerStatus(String status);
    }

    public interface presenter {
        void registerStatus(String name,String email,String phoneno,String password);
    }

    public interface model {

    }
}
