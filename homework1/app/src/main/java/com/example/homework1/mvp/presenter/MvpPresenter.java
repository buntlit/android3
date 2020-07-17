package com.example.homework1.mvp.presenter;


import com.example.homework1.mvp.model.MvpModel;
import com.example.homework1.mvp.view.MvpView;

public class MvpPresenter {

    private MvpModel mvpModel;
    private MvpView mvpView;

    public MvpPresenter(MvpView mvpView) {
        this.mvpView = mvpView;
        mvpModel = new MvpModel();
    }

    private String editString(String oldStr, String addedStr) {
        return oldStr + addedStr;
    }

    public void onButtonClick(String addedStr) {
        String oldStr = mvpModel.getS();
        String newStr = editString(oldStr, addedStr);
        mvpModel.setS(newStr);
        mvpView.setText(newStr);
    }
}


