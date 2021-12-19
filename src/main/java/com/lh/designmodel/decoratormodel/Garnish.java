
package com.lh.designmodel.decoratormodel;

public abstract class Garnish extends FastFood {

    FastFood fastFood;

    public Garnish() {
    }

    public Garnish(FastFood fastFood, String condimentName, double condimentPrice) {
        super.setPrice(condimentPrice);
        super.setDesc(condimentName);
        this.fastFood = fastFood;
    }
}
