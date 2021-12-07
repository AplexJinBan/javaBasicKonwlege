package com.lh.designmodel.adaptermodel.objectadapter;

public class Computer {

    public String readSd(SdCard sdCard){
        if (null == sdCard) {
            throw new RuntimeException("SD Card is not null");
        }
        return sdCard.readSd();
    }

}
