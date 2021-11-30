package com.lh.designmodel.buildermodel;

public class OfferBuilder extends Builder{
    @Override
    public void setFrame() {
        bike.setFrame("钛合金车架");
    }

    @Override
    public void setSet() {
        bike.setSet("橡胶座椅");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
