package com.lh.designmodel.decoratormodel;

public class SellerWindow {
    public static void main(String[]args){

        FastFood fastFood = new FriedRice();

        System.out.println(fastFood.getDesc());
        System.out.println(fastFood.getPrice());
        System.out.println(fastFood.cost());
        System.out.println("===================================Add Condiment");
        fastFood = new EggCondiment(fastFood);

        System.out.println(fastFood.getDesc());
        System.out.println(fastFood.getPrice());
        System.out.println(fastFood.cost());




    }
}
