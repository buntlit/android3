package com.example.homework6.task1;

import android.util.Log;

public class White {

    private static final String TAG = "WHITE";

    White(){
        Green green = new Green();
        Log.d(TAG, green.show());
    }
}
