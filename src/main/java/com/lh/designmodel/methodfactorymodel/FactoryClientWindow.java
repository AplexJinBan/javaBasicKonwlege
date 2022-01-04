package com.lh.designmodel.methodfactorymodel;

public class FactoryClientWindow {

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        AmericaCoffeeFactory americaCoffeeFactory = new AmericaCoffeeFactory();
        coffeeStore.setCoffeeFactory(americaCoffeeFactory);

        Coffee coffee = coffeeStore.orderCoffee();

    }

}
