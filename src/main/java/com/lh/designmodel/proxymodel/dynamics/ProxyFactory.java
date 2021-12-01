package com.lh.designmodel.proxymodel.dynamics;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private TrainStation dynamicTrainStation = new TrainStation();

    public SellTickets getProxySeller(){
        SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(
                this.dynamicTrainStation.getClass().getClassLoader(),
                this.dynamicTrainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("欢迎来到代收窗口");
                        Object invoke = method.invoke(dynamicTrainStation, args);
                        return invoke;
                    }
                }
        );
        return sellTickets;
    }
}
