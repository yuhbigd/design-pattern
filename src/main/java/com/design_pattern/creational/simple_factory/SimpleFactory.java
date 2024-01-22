package com.design_pattern.creational.simple_factory;

interface Shape {
    void draw();
}


// Concrete implementation of Circle
class Circle implements Shape {
    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle" + ", diameter: " + diameter + ", area: "
                + Math.PI * Math.pow(diameter, 2));
    }
}


// Concrete implementation of Square
class Square implements Shape {
    private double size;

    public Square(double size) {
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println("Draw Square" + ", size: " + size + ", area: " + size * size);
    }
}


// Simple Factory class
class ShapeFactory {
    public static Shape createShape(String shapeType, double length) {
        if ("circle".equalsIgnoreCase(shapeType)) {
            return new Circle(length);
        } else if ("square".equalsIgnoreCase(shapeType)) {
            return new Square(length);
        } else {
            throw new IllegalArgumentException("Invalid shape type");
        }
    }
}


public class SimpleFactory {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape("circle", 1);
        Shape square = ShapeFactory.createShape("square", 1);
        circle.draw();
        square.draw();
    }
}
