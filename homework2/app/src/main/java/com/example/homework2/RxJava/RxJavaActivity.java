package com.example.homework2.RxJava;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homework2.R;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class RxJavaActivity extends AppCompatActivity {
    private RxJavaPresenter presenter;
    private Observable<String> observable;
    private Disposable disposable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rxjava);

        presenter = new RxJavaPresenter();
        observable = presenter.sendMsg();
    }

    public void start(View view) {
        observable.observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                RxJavaActivity.this.disposable = d;
            }

            @Override
            public void onNext(String s) {
            }

            @Override
            public void onError(Throwable e) {
            }

            @Override
            public void onComplete() {

            }
        });

    }

    public void stop(View view) {
        disposable.dispose();
    }
}
