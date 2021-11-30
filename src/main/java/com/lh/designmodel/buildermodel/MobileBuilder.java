package com.lh.designmodel.buildermodel;

public class MobileBuilder extends Builder{


    @Override
    public void setFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void setSet() {
        bike.setSet("真皮座椅");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
