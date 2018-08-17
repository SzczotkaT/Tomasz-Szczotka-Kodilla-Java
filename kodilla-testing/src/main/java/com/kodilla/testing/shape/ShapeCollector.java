package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {
    public ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        return shapes.get(n);
    }

    public String showFigures(){
       String figString;
        for(int i = 0; i<shapes.size();i++){
          figString = shapes.get(i).toString();

       }
        return "jakis napis";
    }
}
