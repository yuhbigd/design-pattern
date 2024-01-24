package com.design_pattern.behavioral.memento;

public interface Memento {
    public void restore();
}


class ConcreteMemento implements Memento {
    private double x;
    private double y;
    private Originator originator;



    public ConcreteMemento(double x, double y, Originator originator) {
        this.x = x;
        this.y = y;
        this.originator = originator;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void restore() {
        originator.setX(x);
        originator.setY(y);
    }

}
