package com.design_pattern.structural.decorator;

public interface Beverage {
    void drink();
}


// Drinks which can be decorated
class Coffee implements Beverage {
    @Override
    public void drink() {
        System.out.print("Drinking Coffee");
    }
}


class Soda implements Beverage {
    @Override
    public void drink() {
        System.out.print("Drinking Soda");
    }
}
