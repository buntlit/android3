package com.example.homework5;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class RoomPresenter {

    private static final String TAG = "ROOM PRESENTER";

    private UserDao userDao;

    public RoomPresenter() {
        userDao = App.getAppDatabase().userDao();
    }

    public void putData() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                int count;
                int size;
                if (userDao.getList() == null) {
                    count = 1;
                } else {
                    size = userDao.getList().size();
                    count = userDao.getList().get(size - 1).id + 1;
                }

                Disposable disposable = userDao.insert(initUser(count)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(id -> {
                    Log.d(TAG, "putData: id: " + id);
                }, throwable -> {
                    Log.e(TAG, "putData: " + throwable);
                });
            }
        });
        t.start();


    }

    public void getData() {
        Disposable disposable = userDao.getAll().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(users -> {
            Log.d(TAG, "getData: " + users);
        }, throwable -> {
            Log.e(TAG, "getData: " + throwable);
        });
    }

    public void putDataList() {
        List<User> list = new ArrayList<>();
        User user1 = initUser(1);
        User user2 = initUser(2);
        User user3 = initUser(3);
        list.add(user1);
        list.add(user2);
        list.add(user3);

        Disposable disposable = userDao.insertList(list).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(id -> {
            Log.d(TAG, "putDataList: id: " + id);
        }, throwable -> {
            Log.e(TAG, "putDataList: " + throwable);
        });

    }

    public void updateData() {
        User user = new User();
        user.name = "SuperUser";
        user.surname = "SuperUserov";
        user.age = 20;
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                int size;
                if (userDao.getList() != null) {
                    size = userDao.getList().size();
                    user.id = userDao.getList().get(size - 1).id;
                }
                Disposable disposable = userDao.update(user).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(id -> {
                    Log.d(TAG, "updateData: id: " + id);
                }, throwable -> {
                    Log.e(TAG, "updateData: " + throwable);
                });
            }
        });
        t.start();
    }

    public void deleteUser() {
        User user = new User();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                int size;
                if (userDao.getList() != null) {
                    size = userDao.getList().size();
                    user.id = userDao.getList().get(size - 1).id;
                }

                Disposable disposable = userDao.delete(user).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(id -> {
                    Log.d(TAG, "deleteData: id: " + id);
                }, throwable -> {
                    Log.e(TAG, "deleteData: " + throwable);
                });
            }
        });
        t.start();
    }


    public User initUser(int num) {
        User user = new User();

        user.name = "User" + num;
        user.surname = "Userov" + num;
        user.age = 20 + num;

        return user;
    }
}
