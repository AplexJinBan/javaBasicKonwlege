package com.lh.designmodel.strategymodel;

public class StrategyClientWindow {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());

        salesMan.showStrategy();

    }

}
