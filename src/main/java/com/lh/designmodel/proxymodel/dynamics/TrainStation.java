package com.lh.designmodel.proxymodel.dynamics;

public class TrainStation implements SellTickets {
    @Override
    public void sellTickets() {
        System.out.println("卖出一张票");
    }
}
