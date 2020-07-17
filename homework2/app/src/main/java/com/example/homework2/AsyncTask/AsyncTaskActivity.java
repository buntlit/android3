package com.example.homework2.AsyncTask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.homework2.R;

public class AsyncTaskActivity extends AppCompatActivity {
    private MyAsyncTask myAsyncTask;
    private static final String TAG = "AsyncTask";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task);
    }

    public void onBtnClk(View view) {
        myAsyncTask = new MyAsyncTask();
        myAsyncTask.execute();
        Log.d(TAG, "Method is over");
    }
}