package com.example.homework6.task3;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.homework5.R;
import com.example.homework6.task3.app.App;

import javax.inject.Inject;

public class DaggerActivity extends AppCompatActivity {

    private static final String TAG = "DAGGER ACTIVITY";

    @Inject
    Green green;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dagger_activity);

        App.getAppComponent().inject(this);

        Log.d(TAG, "" + green);
        White white = new White();
        Log.d(TAG, "" + white);
        Red red = new Red();
        Log.d(TAG, "" + red);

    }
}
