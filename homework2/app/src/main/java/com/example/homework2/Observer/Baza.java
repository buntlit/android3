package com.example.homework2.Observer;

import java.util.ArrayList;

public class Baza implements Observable {

    private String tread;
    private ArrayList<Observer> arrayList;

    public Baza() {
        arrayList = new ArrayList<>();
    }


    public void checkObservers(String tread) {
        this.tread = tread;
        spamObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        arrayList.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        arrayList.remove(observer);
    }

    @Override
    public void spamObservers() {
        for (int i = 0; i < arrayList.size(); i++) {
            Observer observer = arrayList.get(0);
            observer.sendSpam(tread);
        }
    }
}
