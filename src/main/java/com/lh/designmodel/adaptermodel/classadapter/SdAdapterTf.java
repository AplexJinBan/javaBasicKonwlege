package com.lh.designmodel.adaptermodel.classadapter;

public class SdAdapterTf extends TfCardImpl implements SdCard{
    @Override
    public String readSd() {
        System.out.println("adapter read tf card");
        return readTf();
    }

    @Override
    public void writeSd(String msg) {
        System.out.println("adapter write tf card");
        writeTf(msg);
    }
}
