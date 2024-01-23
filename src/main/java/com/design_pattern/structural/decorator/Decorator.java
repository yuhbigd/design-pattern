package com.design_pattern.structural.decorator;

public class Decorator {
    public static void main(String[] args) {

        Beverage soda = new Soda();
        soda = new IceCubes(soda, 3);
        soda = new Sugar(soda, 1);

        soda.drink();
        System.out.println();

        Beverage coffee = new Coffee();
        coffee = new IceCubes(coffee, 16);
        coffee = new Milk(coffee, 3f);
        coffee = new Sugar(coffee, 2);

        coffee.drink();
    }
}
