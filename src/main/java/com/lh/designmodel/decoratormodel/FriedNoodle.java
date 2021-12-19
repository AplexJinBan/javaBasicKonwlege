package com.lh.designmodel.decoratormodel;

/**
 * 具体构建者角色
 */
public class FriedNoodle extends FastFood{

    public FriedNoodle(){
        super(12D,"炒面");
    }


    @Override
    public double cost() {
        return getPrice();
    }
}
