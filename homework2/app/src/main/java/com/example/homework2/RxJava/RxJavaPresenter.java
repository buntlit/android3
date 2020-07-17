package com.example.homework2.RxJava;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.schedulers.Schedulers;

public class RxJavaPresenter {
    private static final String  TAG = "MESSAGE";
    public Observable<String> sendMsg() {

        Observable<String> observable = Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Exception {
                try {
                    while (true) {
                        Log.d(TAG, "Hello");
                        TimeUnit.SECONDS.sleep(1);
                    }
                } catch (InterruptedException e) {

                }
            }
        }).subscribeOn(Schedulers.io());

        return observable;
    }
}
