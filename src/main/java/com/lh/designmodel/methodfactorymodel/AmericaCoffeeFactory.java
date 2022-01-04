package com.lh.designmodel.methodfactorymodel;

public class AmericaCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericaCoffee();
    }
}
