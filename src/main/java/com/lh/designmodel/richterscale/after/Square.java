package com.lh.designmodel.richterscale.after;

public class Square implements Quadrilateral{

    private Double side;


    public void setSide(Double length) {
        this.side = length;
    }


    @Override
    public Double getLength() {
        return side;
    }

    @Override
    public Double getWidth() {
        return side;
    }
}
