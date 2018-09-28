package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    String shapeName;
    double side;

    public Square(String shapeName, double side) {
        this.shapeName = shapeName;
        this.side = side;
    }

    public String getShapeName() {
        return this.shapeName;
    }

    public double getField() {
        return side * side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0 &&
                Objects.equals(shapeName, square.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "shapeName='" + shapeName + '\'' +
                ", side=" + side +
                '}';
    }
}
