package com.whiteboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

interface Polygon{

    int getArea();


}

class Square implements Polygon
{
    private final int length;


    Square(int length)
    {
        this.length = length;
    }

    @Override
    public int getArea() {

        // Calculate the area of the Square
        return length * length;
    }

}

class Rectangle implements Polygon{

    private int width, height;

    Rectangle(int width, int height){

        this.width = width;
        this.height = height;

    }


    @Override
    public int getArea() {

        // Calculate the area of the rectangle

        return (width + height) * 2;
    }

}

class Triangle implements Polygon{

    private int base, height;

    Triangle(int base, int height)
    {
        this.base = base;
        this.height = height;
    }

    @Override
    public int getArea() {

        // Calculate the area of the triangle
        double area = 0.5 * base * height;

        return (int) area;
    }
}


public class Whiteboard {


    public static ArrayList<Integer> allPolygons = new ArrayList<Integer>();

    public static void main(String[] args) {

//        Square s1 = new Square(5);
//        System.out.println(s1.getArea());
//
//        Rectangle r1 = new Rectangle(10,5);
//        System.out.println(r1.getArea());

//        allPolygons.add(s1.getArea());
//        allPolygons.add(r1.getArea());



        createPolygons(new Square(5));
        createPolygons(new Rectangle(5, 8));
        createPolygons(new Triangle(2,5));

        getAllPolygonsAreaValue(allPolygons);



    }
    public static void createPolygons(Object polygon)
    {
        System.out.println("Create Shape Methode ");
        Polygon a = (Polygon) polygon;

        System.out.println(a.getArea());

        //Add to ArrayList
        allPolygons.add(a.getArea());

    }

    public static void getAllPolygonsAreaValue(ArrayList<Integer> polygonsList) {

        int shapeareaValue = 0;

        for (int i : polygonsList) {
            shapeareaValue += i;
        }

        System.out.println("All Shapes Area Value :: "+ shapeareaValue);
    }


}
