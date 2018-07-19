package com.news.framework.localdatalayer;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 20-03-2018.
 */

public class MySharedPreference {

    public static void writeString(Context context, String sharedPreferencesname, String prefix, String value) {
        SharedPreferences sharedpreferences = context.getSharedPreferences(sharedPreferencesname, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(prefix, value);
        editor.commit();
    }

    public static String readString(Context context, String sharedPreferencesname, String prefix, String defaultValue) {
        SharedPreferences sharedpreferences = context.getSharedPreferences(sharedPreferencesname, Context.MODE_PRIVATE);
        return sharedpreferences.getString(prefix, defaultValue);

    }

    public static void writeBoolean(Context context, String sharedPreferencesname, String prefix, Boolean value) {
        SharedPreferences sharedpreferences = context.getSharedPreferences(sharedPreferencesname, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putBoolean(prefix, value);
        editor.commit();
    }

    public static boolean readBoolean(Context context, String sharedPreferencesname, String prefix, Boolean defaultValue) {
        SharedPreferences sharedpreferences = context.getSharedPreferences(sharedPreferencesname, Context.MODE_PRIVATE);
        return sharedpreferences.getBoolean(prefix, defaultValue);

    }

    public static void writeInt(Context context, String sharedPreferencesname, String prefix, int value) {
        SharedPreferences sharedpreferences = context.getSharedPreferences(sharedPreferencesname, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putInt(prefix, value);
        editor.commit();
    }

    public static int readInt(Context context, String sharedPreferencesname, String prefix, int defaultValue) {
        SharedPreferences sharedpreferences = context.getSharedPreferences(sharedPreferencesname, Context.MODE_PRIVATE);
        return sharedpreferences.getInt(prefix, defaultValue);

    }

    public static void writeList(Context context, String sharedPreferencesname, String prefix, List<String> value) {
        SharedPreferences prefs = context.getSharedPreferences(sharedPreferencesname, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        int size = prefs.getInt(prefix + "_size", 0);

        // clear the previous data if exists
        for (int i = 0; i < size; i++)
            editor.remove(prefix + "_" + i);

        // write the current list
        for (int i = 0; i < value.size(); i++)
            editor.putString(prefix + "_" + i, value.get(i));

        editor.putInt(prefix + "_size", value.size());
        editor.commit();
    }

    public static List<String> readList(Context context, String sharedPreferencesname, String prefix) {
        SharedPreferences prefs = context.getSharedPreferences(sharedPreferencesname, Context.MODE_PRIVATE);

        int size = prefs.getInt(prefix + "_size", 0);

        List<String> data = new ArrayList<String>(size);
        for (int i = 0; i < size; i++)
            data.add(prefs.getString(prefix + "_" + i, null));

        return data;
    }
}