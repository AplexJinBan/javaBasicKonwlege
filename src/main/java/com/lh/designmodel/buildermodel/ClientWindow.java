package com.lh.designmodel.buildermodel;

public class ClientWindow {

    public static void main(String[] args) {

        Director director = new Director();

        director.createBuilder(new OfferBuilder());

        Bike bike = director.createStuct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSet());


    }

}
