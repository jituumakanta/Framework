package com.news.framework.login;


import android.app.Activity;
import android.content.Context;

import com.news.framework.localdatalayer.MySharedPreference;

public class LoginModel extends Activity implements LoginInterafce.model {


    @Override
    public void saveDatalocally(Context context, String username, String password) {
        MySharedPreference.writeString(context.getApplicationContext(),"mysharedpreference","username",username);
    }
}
