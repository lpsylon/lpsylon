package com.kodilla.testing.shape;

class Circle implements Shape {
    String name = "circle";

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public void getField() {
    }

    @Override
    public String toString() {
        return name;
    }
}
