package com.kodilla.testing.shape;

class Square implements Shape {
    String name = "square";

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
