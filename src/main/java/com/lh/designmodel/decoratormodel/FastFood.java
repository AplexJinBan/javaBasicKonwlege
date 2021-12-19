package com.lh.designmodel.decoratormodel;

/**
 * 快餐类(抽象构建角色)
 */
public abstract class FastFood{

    private double price;

    private String desc;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public FastFood(double price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public FastFood() {
    }

    public abstract double cost();
}
