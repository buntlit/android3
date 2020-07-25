package com.example.homework3.task1;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.schedulers.Schedulers;

public class LambdaPresenter {
    private static final String TAG = "MESSAGE";

    public Observable<String> sendMsg() {

        Observable<String> observable = Observable.create((ObservableOnSubscribe<String>) emitter -> {
            try {
                while (true) {
                    Log.d(TAG, "Hello");
                    TimeUnit.SECONDS.sleep(1);
                }
            } catch (InterruptedException e) {
            }
        }).subscribeOn(Schedulers.io());

        return observable;
    }
}
