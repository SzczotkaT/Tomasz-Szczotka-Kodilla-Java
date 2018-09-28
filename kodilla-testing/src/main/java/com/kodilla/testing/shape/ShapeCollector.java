package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        if (n < shapes.size() - 1 && n >= 0) {
            return shapes.get(n);
        }
        return null;
    }

    public String showFigures() {
        String figString = "";
        for (int i = 0; i < shapes.size(); i++) {
            figString += shapes.get(i).getShapeName();

        }
        return figString;
    }

    public int getListSize() {
        return shapes.size();
    }
}
