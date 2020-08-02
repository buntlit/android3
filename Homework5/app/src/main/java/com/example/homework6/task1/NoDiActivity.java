package com.example.homework6.task1;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.homework5.R;

public class NoDiActivity extends AppCompatActivity {
private static final String TAG = "NO DI ACTIVITY";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.no_di_activity);

        Green green = new Green();
        Log.d(TAG, "" + green);
        Red red = new Red();
        Log.d(TAG, "" + red);
        White white = new White();
        Log.d(TAG, "" + white);
    }
}
