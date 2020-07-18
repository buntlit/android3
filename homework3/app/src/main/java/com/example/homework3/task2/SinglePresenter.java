package com.example.homework3.task2;

import android.util.Log;

import io.reactivex.Single;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.schedulers.Schedulers;

public class SinglePresenter {
    private static final String TAG = "MESSAGE";


    public Single<String> sendMsg() {

        Single<String> single = Single.create((SingleOnSubscribe<String>) emitter -> {
                Log.d(TAG, "Hello");

        }).subscribeOn(Schedulers.io());

        return single;
    }
}
