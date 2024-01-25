package com.design_pattern.behavioral.visitor;


public interface ShapeVisitor {
    void visit(Circle circle);

    void visit(Rectangle rectangle);
}


// Concrete visitor implementing the area calculation algorithm
class AreaCalculator implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        double area = Math.PI * Math.pow(circle.getRadius(), 2);
        System.out.println("Area of circle: " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Area of rectangle: " + area);
    }
}
