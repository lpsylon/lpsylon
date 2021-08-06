package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName = "Circle";
    private double field;
    //private double radius;

    public Circle(double radius) {
        //this.radius = radius;
        this.field = Math.PI * Math.pow(radius, 2);
    }
    @Override
    public int hashCode() {
        return (int)this.field * this.getShapeName().length();
    }
    @Override
    public boolean equals(Shape givenShape){
        if((givenShape.getShapeName() == this.shapeName) && (givenShape.getField() == this.getField())) {
            return true;
        } else {
            return false;
        }
    }
    public String getShapeName() {
        return this.shapeName;
    }
    public double getField() {
        return field;
    }
}
