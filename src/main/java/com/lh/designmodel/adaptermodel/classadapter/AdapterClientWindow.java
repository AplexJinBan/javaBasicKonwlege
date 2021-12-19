package com.lh.designmodel.adaptermodel.classadapter;

import java.io.*;

public class AdapterClientWindow {
    public static void main(String[] args) throws FileNotFoundException {
        Computer computer = new Computer();

        String s = computer.readSd(new SdCardImpl());

        System.out.println(s);

        System.out.println("---------------------------------------");

        String adapterMsg = computer.readSd(new SdAdapterTf());

        System.out.println(adapterMsg);

    }
}
