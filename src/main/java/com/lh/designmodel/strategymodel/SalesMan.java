package com.lh.designmodel.strategymodel;

public class SalesMan {

    private Strategy strategy;

    public SalesMan (Strategy strategy){
        this.strategy = strategy;
    }

    public void showStrategy(){
        this.strategy.show();
    }


}
