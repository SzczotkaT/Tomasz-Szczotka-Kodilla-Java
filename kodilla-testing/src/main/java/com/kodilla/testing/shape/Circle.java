package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    String shapeName;
    final double PI = 3.14;
    double radius;

    public Circle(String shapeName, double radius) {
        this.shapeName = shapeName;
        this.radius = radius;
    }

    public String getShapeName() {
        return this.shapeName;
    }

    public double getField() {
        return (radius * radius) * PI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.PI, PI) == 0 &&
                Double.compare(circle.radius, radius) == 0 &&
                Objects.equals(shapeName, circle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, PI, radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shapeName='" + shapeName + '\'' +
                ", PI=" + PI +
                ", radius=" + radius +
                '}';
    }
}
