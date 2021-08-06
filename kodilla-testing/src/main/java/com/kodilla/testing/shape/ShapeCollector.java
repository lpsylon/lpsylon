package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeList = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        this.shapeList.add(shape);
    }
    public void removeFigure(Shape shape){}
    public Shape getFigure(int n){
        return this.shapeList.get(n);
    }
    public String showFigures(){
        String text = "";
        for(Shape entry :shapeList) {
            text += (entry+"\n");
        }
        return text;
    }
    public List<Shape> getShapeList() {
        return (ArrayList<Shape>) this.shapeList;
    }
}