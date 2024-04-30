package com.shapes;

public class Rectangle extends Polygon{

    private double width, height, borderWidth;

    public Rectangle(double width, double height){

        this.width = width;
        this.height = height;

    }

    public Rectangle(double width, double height, double borderWidth){
        this.width = width;
        this.height = height;
        this.borderWidth = borderWidth;

    }



    @Override
    public double getArea() {

        // Calculate the area of the rectangle

        return width * height;
    }

    @Override
    public double getAreaWithBorder() {
        // Calculate the length and width considering the border
        double totalLength = height + 2 * borderWidth;
        double totalWidth = width + 2 * borderWidth;

        double totalArea = totalLength * totalWidth;


        return totalArea;
    }

}