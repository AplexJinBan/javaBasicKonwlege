package com.lh.designmodel.adaptermodel.classadapter;

public class TfCardImpl implements TfCard{
    @Override
    public String readTf() {
        String msg = "Hello World TF card";
        return msg;
    }

    @Override
    public void writeTf(String msg) {
        System.out.println("读取参数 TF Card ------->" + msg);
    }
}
