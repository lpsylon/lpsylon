package com.kodilla.testing.shape;

class Triangle implements Shape {
    String name = "triangle";

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
