package com.lh.designmodel.decoratormodel;

/**
 * 具体构建者角色
 */
public class FriedRice extends FastFood{

    public FriedRice(){
        super(10D,"炒饭");
    }


    @Override
    public double cost() {
        return getPrice();
    }
}
