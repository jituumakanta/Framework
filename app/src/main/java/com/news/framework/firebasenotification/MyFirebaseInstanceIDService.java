package com.news.framework.firebasenotification;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.news.framework.localdatalayer.MySharedPreference;

import static com.facebook.FacebookSdk.getApplicationContext;


/**
 * Created by Lenovo on 16-03-2018.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    public static String firebaseid;

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        //Getting registration token
        firebaseid = FirebaseInstanceId.getInstance().getToken();
        //Displaying token on logcat
        Log.d("FIREBASEID: ", "Refreshed token: " + firebaseid);
        /*saving firebasetoken in sh*/
        MySharedPreference.writeString(getApplicationContext(), "VELHOMODEL", "FIREBASEID", firebaseid);
    }
}