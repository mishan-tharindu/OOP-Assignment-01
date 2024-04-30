package com.shapes;

public class Square extends Polygon{
    private double length, area, areawithBoder;




    public Square(double length)
    {
        this.length = length;
    }

    public Square(double length, double borderWidth){

        super(borderWidth);
        this.length = length;

    }

    @Override
    public double getArea() {

        // Calculate the area of the Square
        area = length * length;

        return area;
    }


    @Override
    public double getAreaWithBorder() {

        areawithBoder = Math.pow(length + 2 * getBorderWidth(), 2);

        return areawithBoder;
    }


}