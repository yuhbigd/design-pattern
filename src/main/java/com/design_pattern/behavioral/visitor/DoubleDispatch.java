// package com.design_pattern.behavioral.visitor;

// // Interface
// interface Graphic {
// void draw();
// }


// // Base class
// class Shape implements Graphic {
// private int id;

// public int getId() {
// return id;
// }

// public void setId(int id) {
// this.id = id;
// }

// public Shape(int id) {
// this.id = id;
// }

// @Override
// public void draw() {
// System.out.println("Drawing a Shape with id: " + id);
// }

// }


// // Dot class extending Shape
// class Dot extends Shape {
// private int x, y;

// public int getX() {
// return x;
// }

// public void setX(int x) {
// this.x = x;
// }

// public int getY() {
// return y;
// }

// public void setY(int y) {
// this.y = y;
// }

// public Dot(int id, int x, int y) {
// super(id);
// this.x = x;
// this.y = y;
// }

// @Override
// public void draw() {
// System.out.println(
// "Drawing a Dot with id: " + getId() + " at coordinates (" + x + ", " + y + ")");
// }
// // Other methods for Dot...
// }


// // Circle class extending Dot
// class Circle extends Dot {
// private int radius;

// public Circle(int id, int x, int y, int radius) {
// super(id, x, y);
// this.radius = radius;
// }

// @Override
// public void draw() {
// System.out.println("Drawing a Circle with id: " + getId() + ", radius: " + radius
// + " at coordinates (" + getX() + ", " + getY() + ")");
// }
// // Other methods for Circle...
// }


// // Rectangle class extending Shape
// class Rectangle extends Shape {
// private int width, height;

// public Rectangle(int id, int width, int height) {
// super(id);
// this.width = width;
// this.height = height;
// }

// @Override
// public void draw() {
// System.out.println("Drawing a Rectangle with id: " + getId() + ", width: " + width
// + ", height: " + height);
// }
// // Other methods for Rectangle...
// }


// class CompoundGraphic implements Graphic {
// private Graphic[] children;

// public CompoundGraphic(Graphic[] children) {
// this.children = children;
// }

// @Override
// public void draw() {
// System.out.println("Drawing a CompoundGraphic");
// for (Graphic child : children) {
// child.draw();
// }
// }
// }


// class Exporter {
// // Method to export a generic Shape
// public void export(Shape s) {
// System.out.println("Exporting shape");
// }

// // Method to export a Dot
// public void export(Dot d) {
// System.out.println("Exporting dot");
// }

// // Method to export a Circle
// public void export(Circle c) {
// System.out.println("Exporting circle");
// }

// // Method to export a Rectangle
// public void export(Rectangle r) {
// System.out.println("Exporting rectangle");
// }

// // Method to export a CompoundGraphic
// public void export(CompoundGraphic cs) {
// System.out.println("Exporting compound");
// }
// }


// public class DoubleDispatch {
// public static void export(Shape shape) {
// Exporter exporter = new Exporter();
// exporter.export(shape);
// }

// public static void main(String[] args) {

// // Create instances of different shapes
// Shape shape = new Shape(1);
// Dot dot = new Dot(2, 3, 4);
// Circle circle = new Circle(3, 5, 6, 7);
// Rectangle rectangle = new Rectangle(4, 8, 9);
// // Graphic[] children = {new Dot(5, 10, 11), new Circle(6, 12, 13, 14)};
// // CompoundGraphic compoundGraphic = new CompoundGraphic(children);

// // wrong -> because the compiler will choose the safest path to go so everything will go to
// // Shape because all is shape implementor.
// export(shape);
// export(dot);
// export(circle);
// export(rectangle);
// }
// }
// // https://refactoring.guru/design-patterns/visitor-double-dispatch
