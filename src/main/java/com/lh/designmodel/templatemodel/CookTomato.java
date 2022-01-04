package com.lh.designmodel.templatemodel;

public class CookTomato extends FriedDishTemplate{
    @Override
    public void pourVegetable() {
        System.out.println("---------------4 土豆");
    }

    @Override
    public void pourSauce() {
        System.out.println("---------------5 辣椒");
    }
}
