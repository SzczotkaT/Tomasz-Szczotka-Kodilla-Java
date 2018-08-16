package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    String shapeName;
    double side;
    double height;

    public Triangle(String shapeName, double side, double height) {
        this.shapeName = shapeName;
        this.side = side;
        this.height = height;
    }

    public String getShapeName(){
        return this.shapeName;
    }

    public double getField(){
        return (side * height) / 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.side, side) == 0 &&
                Double.compare(triangle.height, height) == 0 &&
                Objects.equals(shapeName, triangle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, side, height);
    }
}
