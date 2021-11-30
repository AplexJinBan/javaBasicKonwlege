package com.lh.designmodel.buildermodel;

public abstract class Builder {

    protected Bike bike = new Bike();

    public abstract void setFrame();

    public abstract void setSet();

    public abstract Bike createBike();

}
