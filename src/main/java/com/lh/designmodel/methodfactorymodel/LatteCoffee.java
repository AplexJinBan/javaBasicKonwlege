package com.lh.designmodel.methodfactorymodel;

public class LatteCoffee extends Coffee{
    @Override
    public void addMilk() {
        System.out.println("添加三分牛奶");
    }

    @Override
    public void addSugar() {
        System.out.println("添加五分糖");
    }

    @Override
    public void getName() {
        System.out.println("拿铁咖啡");
    }
}
