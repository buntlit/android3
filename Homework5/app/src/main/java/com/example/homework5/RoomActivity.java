package com.example.homework5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class RoomActivity extends AppCompatActivity {

    private RoomPresenter roomPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roomPresenter = new RoomPresenter();
    }

    public void put(View view) {
        roomPresenter.putData();
    }

    public void putList(View view) {
        roomPresenter.putDataList();
    }

    public void get(View view) {
        roomPresenter.getData();
    }

    public void update(View view) {
        roomPresenter.updateData();
    }

    public void delete(View view) {
        roomPresenter.deleteUser();
    }
}