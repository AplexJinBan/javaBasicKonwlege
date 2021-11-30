package com.lh.designmodel.buildermodel;

public class Director {

    Builder builder;

    public void createBuilder(Builder builder){

        this.builder = builder;

    }


    public Bike createStuct(){
        builder.setFrame();
        builder.setSet();
        Bike bike = builder.createBike();
        return bike;

    }

}
