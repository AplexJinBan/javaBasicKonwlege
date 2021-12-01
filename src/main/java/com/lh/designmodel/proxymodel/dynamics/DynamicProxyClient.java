package com.lh.designmodel.proxymodel.dynamics;

public class DynamicProxyClient {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxySeller = proxyFactory.getProxySeller();
        proxySeller.sellTickets();
    }
}
