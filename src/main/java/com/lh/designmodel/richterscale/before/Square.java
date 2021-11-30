package com.lh.designmodel.richterscale.before;

import com.lh.designmodel.richterscale.before.Rectangle;

public class Square extends Rectangle {

    private Double length;

    private Double width;


    @Override
    public Double getLength() {
        return length;
    }

    @Override
    public void setLength(Double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public Double getWidth() {
        return width;
    }

    @Override
    public void setWidth(Double width) {
        this.width = width;
        this.length = width;
    }
}
