package com.example.homework2.Observer;

import android.util.Log;

public class Spam implements Observer{

    private static final String TAG = "Spam";

    @Override
    public void sendSpam(String thread) {
        Log.d(TAG, "Thread: " + thread);
    }
}
