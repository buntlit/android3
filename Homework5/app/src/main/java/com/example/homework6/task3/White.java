package com.example.homework6.task3;

import android.util.Log;

import com.example.homework6.task3.app.App;

import javax.inject.Inject;

public class White {

    private static final String TAG = "WHITE";

    @Inject
    Green green;

    public White(){
        App.getAppComponent().inject(this);
        Log.d(TAG, green.show());
    }
}
