package com.lh.designmodel.methodfactorymodel;

public class AmericaCoffee extends Coffee{

    @Override
    public void addMilk() {
        System.out.println("添加五分牛奶");
    }

    @Override
    public void addSugar() {
        System.out.println("添加三分糖");
    }

    @Override
    public void getName() {
        System.out.println("美式咖啡");
    }
}
