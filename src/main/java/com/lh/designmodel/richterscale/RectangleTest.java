package com.lh.designmodel.richterscale;

public class RectangleTest {

    public static void reversal(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }

    public static void printRectangle(Rectangle rectangle){

        System.out.println(rectangle.getLength() + "--------length");
        System.out.println(rectangle.getWidth() + "--------width");
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20D);
        rectangle.setWidth(10D);
        reversal(rectangle);
        printRectangle(rectangle);
        System.out.println("--------------------------------");
        Square square = new Square();
        square.setLength(20D);
        reversal(square);
        printRectangle(square);

    }

}
