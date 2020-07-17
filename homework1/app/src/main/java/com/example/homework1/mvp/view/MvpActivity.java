package com.example.homework1.mvp.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homework1.R;
import com.example.homework1.mvp.presenter.MvpPresenter;


public class MvpActivity extends AppCompatActivity implements MvpView {


    private Button button;
    private EditText editText;
    private TextView textView;
    private MvpPresenter mvpPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        mvpPresenter = new MvpPresenter(this);
    }

    public void buttonClick(View view) {
        mvpPresenter.onButtonClick(editText.getText().toString());
        editText.setText("");
    }

    public void setText(String s) {
        textView.setText(s);
    }
}