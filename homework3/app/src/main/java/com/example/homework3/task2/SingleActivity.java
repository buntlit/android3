package com.example.homework3.task2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homework3.R;

import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class SingleActivity extends AppCompatActivity {
    private static final String TAG = "SINGLE";
    private SinglePresenter presenter;
    private Single<String> single;
    private Disposable disposable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);

        ButterKnife.bind(this);

        presenter = new SinglePresenter();
        single = presenter.sendMsg();
    }

    @OnClick(R.id.send)
    public void onClickButtonSend(View view) {
        disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(string -> {
        }, throwable -> {
            Log.e(TAG, "OnError", throwable);
        });
    }
}
