package com.lh.designmodel.observermodel;

public class MainWindow {
    public static void main(String [] args){

        WeiXinObserver itemOne = new WeiXinObserver("WeChat");

        RealSubject realSubject = new RealSubject();
        realSubject.addObserver(itemOne);

        realSubject.notifyObserver("测试 通过！！！！");

    }
}
