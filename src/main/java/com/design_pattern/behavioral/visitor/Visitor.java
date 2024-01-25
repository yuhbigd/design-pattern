package com.design_pattern.behavioral.visitor;


public class Visitor {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        AreaCalculator areaCalculator = new AreaCalculator();
        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }

    }
}
