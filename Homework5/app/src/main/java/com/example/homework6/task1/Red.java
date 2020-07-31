package com.example.homework6.task1;

import android.util.Log;

public class Red {
    private static final String TAG = "RED";
    Red(){
        Green green = new Green();
        Log.d(TAG, green.show());
    }
}
