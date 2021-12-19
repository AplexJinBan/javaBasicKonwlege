package com.lh.designmodel.decoratormodel;

public class EggCondiment extends Garnish{


    public EggCondiment(FastFood fastFood){
        super(fastFood,"egg",1.5D);
    }

    @Override
    public double cost() {
        return getPrice() + super.fastFood.getPrice();
    }
}
