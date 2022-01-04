package com.lh.designmodel.observermodel;

public class WeiXinObserver implements Observer{

    private String name;

    public WeiXinObserver(String name) {
        this.name = name;
    }

    public WeiXinObserver(){

    }

    @Override
    public void showMessage(String message) {
        System.out.println(name + " --- " + message);
    }
}
