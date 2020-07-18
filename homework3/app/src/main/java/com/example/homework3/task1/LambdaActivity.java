package com.example.homework3.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.homework3.R;

import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class LambdaActivity extends AppCompatActivity {
    private static final String TAG = "LAMBDA";
    private LambdaPresenter presenter;
    private Observable<String> observable;
    private Disposable disposable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lambda);

        ButterKnife.bind(this);

        presenter = new LambdaPresenter();
        observable = presenter.sendMsg();
    }

    @OnClick(R.id.startSend)
    public void onClickButtonSend(View view){
        disposable = observable.observeOn(AndroidSchedulers.mainThread()).subscribe(string -> {
        }, throwable -> {
            Log.e(TAG, "OnError");
            }, () ->{
        });
    }

    @OnClick(R.id.stopSend)
    public void onClickButtonStop(View view){
        disposable.dispose();
    }
}