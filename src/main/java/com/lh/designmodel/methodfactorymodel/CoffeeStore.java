package com.lh.designmodel.methodfactorymodel;

public class CoffeeStore {
    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory factory){
        this.coffeeFactory = factory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addSugar();
        coffee.addMilk();
        return coffee;

    }

}
