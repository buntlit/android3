package com.example.homework2.Observer;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homework2.R;

public class ObserverActivity extends AppCompatActivity {
    public Baza baza = new Baza();
    public Spam spam = new Spam();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actyvity_observer);
    }

    public void register(View view) {
        baza.registerObserver(spam);
    }

    public void unregister(View view) {
        baza.unregisterObserver(spam);
    }

    public void spam(View view) {
        baza.checkObservers(Thread.currentThread().getName());
    }
}
