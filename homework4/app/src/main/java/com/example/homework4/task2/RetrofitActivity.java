package com.example.homework4.task2;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.homework4.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.android.schedulers.AndroidSchedulers;

public class RetrofitActivity extends AppCompatActivity {

    private static final String TAG = "ACTIVITY";
    private RetrofitPresenter retrofitPresenter;

    @BindView(R.id.imageView)
    ImageView imageView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        retrofitPresenter = new RetrofitPresenter();
        ButterKnife.bind(this);
        retrofitPresenter.getString().observeOn(AndroidSchedulers.mainThread()).subscribe(user -> {
            Glide.with(this).load(user.avatarUrl).into(imageView);
        }, throwable -> {
            Log.e(TAG, throwable.toString());
        });
    }
}
