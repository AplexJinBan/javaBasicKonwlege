package com.lh.designmodel.proxymodel.statics;

public class ProxySellWindow implements SellTickets{

    private TrainStation trainStation = new TrainStation();

    @Override
    public void sellTickets() {
        System.out.println("收取中介费用");
        trainStation.sellTickets();
        System.out.println("结束");
    }
}
