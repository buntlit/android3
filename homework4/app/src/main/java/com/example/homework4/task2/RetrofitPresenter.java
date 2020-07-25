package com.example.homework4.task2;

import io.reactivex.Observable;

public class RetrofitPresenter {

    private RetrofitApi retrofitApi;

    public RetrofitPresenter() {
        retrofitApi = new RetrofitApi();
    }

    public Observable<User> getString() {
        Observable<User> single = retrofitApi.requestServer();
        return single;
    }
}
