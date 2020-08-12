package com.example.homework8;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.homework5.R;

public class LeakCanaryActivity extends AppCompatActivity {

    static Activity activity = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leak_canary_activity);
        if (activity==null){
            activity = this;
        }
    }

}
