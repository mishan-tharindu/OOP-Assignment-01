package com.whiteboard;

import com.shapes.*;

import java.util.ArrayList;

public class Whiteboard {

    public static ArrayList<Polygon> Polygons = new ArrayList<Polygon>();



    public static void createPolygons(Object polygon)
    {
        Polygon a = (Polygon) polygon;
//        add Shapes
        Polygons.add(a);

    }

    public static double getAllShapesArea(){

        double shapesArea = 0.0;

        for (Polygon Polygon : Polygons){
            shapesArea += Polygon.getArea();
        }

        return shapesArea;

    }


    public static double getAllPolygonsAreawithBorder()
    {
        double shapesAreaWithBorder = 0.0;

        for (Polygon Polygon : Polygons){
            shapesAreaWithBorder += Polygon.getAreaWithBorder();
        }

        return  shapesAreaWithBorder;
    }

    public static double getBorderArea(){

        double shapesBorderArea = 0.0;

        for (Polygon polygon : Polygons){
            shapesBorderArea += polygon.getAreaBorder();
        }

        return  shapesBorderArea;
    }








}
