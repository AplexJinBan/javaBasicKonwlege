package com.lh.designmodel.adaptermodel.objectadapter;

public class AdapterClientWindow {
    public static void main(String[] args) {
        Computer computer = new Computer();

        String s = computer.readSd(new SdCardImpl());

        System.out.println(s);

        System.out.println("---------------------------------------");

        String adapterMsg = computer.readSd(new SdAdapterTf(new TfCardImpl()));

        System.out.println(adapterMsg);

    }
}
