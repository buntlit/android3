package com.example.homework1.moxy.view;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.homework1.R;
import com.example.homework1.moxy.presenter.MoxyPresenter;

import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;


public class MoxyActivity extends MvpAppCompatActivity implements MoxyView {

    private Button button;
    private EditText editText;
    private TextView textView;

    @InjectPresenter
    MoxyPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moxy);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
    }

    @Override
    public void setText(String s) {
        textView.setText(s);
    }

    public void buttonClick(View view) {
        mainPresenter.onButtonClick(editText.getText().toString());
        editText.setText("");
    }
}
