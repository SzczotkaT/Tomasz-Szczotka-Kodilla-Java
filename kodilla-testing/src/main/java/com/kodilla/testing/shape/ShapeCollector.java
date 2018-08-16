package com.kodilla.testing.shape;

import sun.java2d.pipe.ShapeSpanIterator;

import java.util.*;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public void removeFigure(Shape shape){
        //temporarily, do nothing
    }

    public Shape getFigure(int n){
        //temporarily,
        return shapes.get(n);
    }

    public void showFigures(){
        //temporarily empty,
    }
}
