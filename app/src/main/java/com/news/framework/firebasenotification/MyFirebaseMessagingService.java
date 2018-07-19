package com.news.framework.firebasenotification;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;




/**
 * Created by Lenovo on 16-03-2018.
 */

/**
       example of server data in raw format of json
        {
         "to": "/topics/vellhotask",

        "data": {
            "extra_information": "This is some extra information",
                    "tes":"my test",
                    "test1":"my test1"
                 },

        "notification": {
                     "title": "New York Weather Update!",
                    "text": "This is the notification message."
                        }
        }
      */

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        /*subscribe the topic to sent multiple device*/
        FirebaseMessaging.getInstance().subscribeToTopic("vellhotask");
        classifyAlltheData(remoteMessage);
    }

    public void classifyAlltheData(RemoteMessage remoteMessage) {

        try {
            //Log.d("MYLOG", "MyFirebaseMessagingService: onMessageReceived: remoteMessage.toString(): " + remoteMessage.toString());
            Log.d("MYLOG", "MyFirebaseMessagingService: onMessageReceived: remoteMessage.getNotification().getBody(): " + remoteMessage.getNotification().getBody());
            Log.d("MYLOG", "MyFirebaseMessagingService: onMessageReceived: remoteMessage.getData(): " + remoteMessage.getData());
            Log.d("MYLOG", "MyFirebaseMessagingService: onMessageReceived: remoteMessage.getNotification().getTitle(): " + remoteMessage.getNotification().getTitle());
            Log.d("MYLOG", "MyFirebaseMessagingService: onMessageReceived: remoteMessage.getFrom(): " + remoteMessage.getFrom());


            /*these are the details which has received from notfication server*/
            String form = remoteMessage.getFrom();
            Map<String, String> data = remoteMessage.getData();
            String title = remoteMessage.getNotification().getTitle();
            String body = remoteMessage.getNotification().getBody();
            Log.d("MYLOG", "MyFirebaseMessagingService: " + "classifyAlltheData: " + "form: " + form);
            Log.d("MYLOG", "MyFirebaseMessagingService: " + "classifyAlltheData: " + "data: " + data);
            Log.d("MYLOG", "MyFirebaseMessagingService: " + "classifyAlltheData: " + "title: " + title);
            Log.d("MYLOG", "MyFirebaseMessagingService: " + "classifyAlltheData: " + "body: " + body);

            /*send the data to notification area to display*/
            //sendToNotification(title, body,getApplicationContext());
        } catch (Exception e) {
            Log.d("MYLOG", "MyFirebaseMessagingService: classifyAlltheData: Exception: " + e);
        }

    }


}