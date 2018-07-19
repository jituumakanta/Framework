package com.news.framework.firebasenotification;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.news.framework.R;


public class NotificationViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_view);
        Intent intent=getIntent();
        Bundle b=intent.getExtras();
        String s=b.getString("title");
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.cancelAll();
    }
}
