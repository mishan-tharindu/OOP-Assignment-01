package com.whiteboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

interface Polygon{

    double getArea();

    double addBorder();


}

class Square implements Polygon
{
    private double length;

    private double borderWidth;


    Square(double length)
    {
        this.length = length;
    }

    Square(double length, double borderWidth){

        this.length = length;
        this.borderWidth = borderWidth;

    }

    @Override
    public double getArea() {

        // Calculate the area of the Square
        return length * length;
    }

    @Override
    public double addBorder() {

        double areawithBorder = Math.pow(length + 2 * borderWidth, 2);

        return areawithBorder;
    }
}

class Rectangle implements Polygon{

    private double width, height, boderWidth;

    Rectangle(double width, double height){

        this.width = width;
        this.height = height;

    }

    Rectangle(double width, double height, double boderWidth){
        this.width = width;
        this.height = height;
        this.boderWidth = boderWidth;
    }


    @Override
    public double getArea() {

        // Calculate the area of the rectangle

        return width * height;
    }

    @Override
    public double addBorder() {

        double areawithBorder = (width + 2 * boderWidth) * (height + 2 * boderWidth);

        return areawithBorder;
    }
}

class Triangle implements Polygon{

    private double base, height, borderWidth;

    Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    Triangle(double base, double height, double borderWidth){
        this.base = base;
        this.height = height;
        this.borderWidth = borderWidth;
    }

    @Override
    public double getArea() {

        // Calculate the area of the triangle
        double areawithBorder = 0.5 * base * height;

        return  areawithBorder;
    }

    @Override
    public double addBorder() {

        double newBaseValue = base + 2 * borderWidth;
        double newHeightValue = height + 2 * height;

        double areawithBorder = 0.5 * newBaseValue * newHeightValue;

        return areawithBorder;
    }
}

class Circle implements Polygon{

    private double radius, borderWidth;

    Circle(double radius)
    {
        this.radius = radius;
    }

    Circle(double radius, double borderWidth){
        this.radius = radius;
        this.borderWidth = borderWidth;
    }

    @Override
    public double getArea() {

        double circleArea = Math.PI * radius * radius;

        return  circleArea;
    }

    @Override
    public double addBorder() {

        double areaWithBorder = Math.PI * Math.pow(radius + borderWidth, 2);

        return 0;
    }
}

class Parallelogram implements Polygon{

    private double base, height, borderWidth;

    Parallelogram(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    Parallelogram(double base, double height, double borderWidth)
    {
        this.base = base;
        this.height = height;
        this.borderWidth = borderWidth;
    }

    @Override
    public double getArea() {

        double area = base * height;

        return area;
    }

    @Override
    public double addBorder() {

        double newBaseValue = base + 2 * borderWidth;
        double newHeightValue = height + 2 * height;

        double areawithBorder = 0.5 * newBaseValue * newHeightValue;

        return areawithBorder;
    }
}



public class Whiteboard {


    public static ArrayList<Double> allPolygons = new ArrayList<Double>();
    public static ArrayList<Double> allPolygonsAreaWithBorder = new ArrayList<Double>();

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

        createPolygons(new Circle(7));
        createPolygons(new Parallelogram(15, 10));


        System.out.println("All Polygons Area Value :: "+ getAllPolygonsAreaValue(allPolygons));

        addBorder(new Square(5, 0.5));
        addBorder(new Square(8, 0.5));

        System.out.println("All Polygons Area Value with Border :: "+getAllPolygonsAreawithBorder(allPolygonsAreaWithBorder));

        System.out.println("All Polygons Border Area Only :: "+ getAllPolygonsBorderArea());



    }

    public static double getAllPolygonsBorderArea()
    {


        double polygonsarea = getAllPolygonsAreaValue(allPolygons);
        double polygonsareaWithBorder = getAllPolygonsAreawithBorder(allPolygonsAreaWithBorder);

        double boderArea = polygonsarea -polygonsareaWithBorder;

        return boderArea;
    }

    public static double getAllPolygonsAreawithBorder(ArrayList<Double> polygonsList)
    {
        Double polygonsAreaValueWithBorder = 0.0;

        for (Double i : polygonsList) {
            polygonsAreaValueWithBorder += i;
        }

        return  polygonsAreaValueWithBorder;
    }

    public static void addBorder(Object polygon)
    {
        Polygon a = (Polygon) polygon;

        allPolygonsAreaWithBorder.add(a.addBorder());
    }

    public static void createPolygons(Object polygon)
    {
//        System.out.println("Create Shape Methode ");
        Polygon a = (Polygon) polygon;

//        System.out.println(a.getArea());

        //Add to ArrayList
        allPolygons.add(a.getArea());

    }

    public static double getAllPolygonsAreaValue(ArrayList<Double> polygonsList) {

        Double shapeareaValue = 0.0;

        for (Double i : polygonsList) {
            shapeareaValue += i;
        }

//        System.out.println("All Shapes Area Value :: "+ shapeareaValue);

        return  shapeareaValue;
    }




}
