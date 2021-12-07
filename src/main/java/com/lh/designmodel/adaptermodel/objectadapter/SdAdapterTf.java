package com.lh.designmodel.adaptermodel.objectadapter;

import com.lh.designmodel.adaptermodel.classadapter.TfCardImpl;

public class SdAdapterTf  implements SdCard {

    private TfCard tfCard;

    public SdAdapterTf(TfCard tfCard){
        this.tfCard = tfCard;
    }

    @Override
    public String readSd() {
        System.out.println("adapter read tf card");
        return tfCard.readTf();
    }

    @Override
    public void writeSd(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTf(msg);
    }
}
