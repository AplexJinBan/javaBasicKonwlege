package com.lh.designmodel.adaptermodel.classadapter;

public class SdCardImpl implements SdCard{
    @Override
    public String readSd() {
        String msg = "Hello world SD Card";
        return msg;
    }

    @Override
    public void writeSd(String msg) {
        System.out.println("SD Card 读取到的数据 ----------->" + msg );
    }
}
