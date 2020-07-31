package com.example.homework6.task3;

import android.util.Log;

import com.example.homework6.task3.app.App;
import com.example.homework6.task3.app.AppComponent;

import javax.inject.Inject;

public class Red {
    private static final String TAG = "RED";

    @Inject
    Green green;

    public Red(){
        App.getAppComponent().inject(this);
        Log.d(TAG, green.show());
    }
}
