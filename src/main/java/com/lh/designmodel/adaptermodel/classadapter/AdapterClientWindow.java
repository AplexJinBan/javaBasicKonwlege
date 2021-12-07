package com.lh.designmodel.adaptermodel.classadapter;

public class AdapterClientWindow {
    public static void main(String[] args) {
        Computer computer = new Computer();

        String s = computer.readSd(new SdCardImpl());

        System.out.println(s);

        System.out.println("---------------------------------------");

        String adapterMsg = computer.readSd(new SdAdapterTf());

        System.out.println(adapterMsg);

    }
}
