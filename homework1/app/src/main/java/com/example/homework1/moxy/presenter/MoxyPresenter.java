package com.example.homework1.moxy.presenter;


import com.example.homework1.moxy.model.MoxyModel;
import com.example.homework1.moxy.view.MoxyView;

import moxy.InjectViewState;
import moxy.MvpPresenter;

@InjectViewState
public class MoxyPresenter extends MvpPresenter<MoxyView> {

    private MoxyModel model;

    public MoxyPresenter(){
        this.model = new MoxyModel();
    }

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
    }

    private String editString(String oldStr, String addedStr) {
        return oldStr + addedStr;
    }

    public void onButtonClick(String addedStr){
        String oldStr = model.getS();
        String newStr = editString(oldStr, addedStr);
        model.setS(newStr);
        getViewState().setText(newStr);
    }
}
