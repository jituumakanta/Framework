package com.news.framework.homepage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.news.framework.R;

public class HomePageActivity extends AppCompatActivity implements HomePageInterface.view {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }
}
