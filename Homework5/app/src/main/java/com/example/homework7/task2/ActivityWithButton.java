package com.example.homework7.task2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.homework5.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityWithButton extends AppCompatActivity {

    @BindView(R.id.text)
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_button);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void onButtonClick(){
        textView.setText("Hello!");
    }
}
