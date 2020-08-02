package com.example.homework4.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.homework4.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonActivity extends AppCompatActivity {

    private static final String TAG = "TIME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gson);

        String json = "{\n" +
                " \"time_of_year\": \"summer\",\n" +
                " \"year\": 2019}";

        Gson gson = new GsonBuilder().create();
        Time time = gson.fromJson(json, Time.class);

        Log.d(TAG, "Time of year: " + time.timeOfYear);
        Log.d(TAG, "Year: " + time.year);
    }
}