package com.lh.designmodel.richterscale.after;

public class Rectangle implements Quadrilateral{

    private Double length;

    private Double width;

    public void setLength(Double length) {
        this.length = length;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public Double getLength() {
        return length;
    }

    @Override
    public Double getWidth() {
        return width;
    }
}
