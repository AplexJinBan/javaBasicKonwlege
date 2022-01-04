package com.lh.designmodel.templatemodel;

public abstract class FriedDishTemplate {

    public final void cook(){
        pushOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    public void pushOil(){
        System.out.println("--------------1 倒油");
    }

    public void heatOil(){
        System.out.println("--------------2 热油");
    }

    public abstract void pourVegetable();

    public abstract void pourSauce();

    public void fry(){
        System.out.println("---------------5 翻炒");
    }


}
