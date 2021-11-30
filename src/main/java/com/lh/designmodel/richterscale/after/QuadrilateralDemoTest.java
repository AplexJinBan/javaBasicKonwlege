package com.lh.designmodel.richterscale.after;

import com.lh.designmodel.richterscale.before.Rectangle;

public class QuadrilateralDemoTest {
    public static void main(String[] args) {

    }

    public static void reversal(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }
    public static void printfQuadrilateral(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }

}
