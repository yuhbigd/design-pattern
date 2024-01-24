package com.design_pattern.behavioral.memento;

public class Originator {
    private double x;
    private double y;

    public Originator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Memento save() {
        return new ConcreteMemento(this.x, this.y, this);
    }

    @Override
    public String toString() {
        return "X: " + x + ", Y: " + y;
    }
}
