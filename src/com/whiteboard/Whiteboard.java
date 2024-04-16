package com.whiteboard;

import com.shapes.*;

import java.util.ArrayList;

public class Whiteboard {


    public static ArrayList<Double> allPolygons = new ArrayList<Double>();
    public static ArrayList<Double> allPolygonsAreaWithBorder = new ArrayList<Double>();

    public static ArrayList<Polygon> polygons = new ArrayList<Polygon>();

    public static void main(String[] args) {

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
        getShapes(polygons);



    }

    public static double getAllPolygonsBorderArea()
    {


        double polygonsarea = getAllPolygonsAreaValue(allPolygons);
        double polygonsareaWithBorder = getAllPolygonsAreawithBorder(allPolygonsAreaWithBorder);

        double boderArea = polygonsarea - polygonsareaWithBorder;

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

//        add Shapes
        polygons.add(a);


    }


    public static void getShapes(ArrayList<Polygon> polygons){

        Double shapesArea = 0.0;

        for (Polygon polygon : polygons){
            shapesArea += polygon.getArea();
        }

        System.out.println("ALl Shapes Area :::: "+shapesArea);

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
