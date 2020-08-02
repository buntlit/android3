package com.example.homework6.task2;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.homework5.R;

public class DiActivity extends AppCompatActivity {

    private static final String TAG = "DI ACTIVITY";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.di_activity);

        Green green = new Green();
        Log.d(TAG, "" + green);
        Red red = new Red(green);
        Log.d(TAG, "" + red);
        White white = new White(green);
        Log.d(TAG, "" + white);
    }
}
