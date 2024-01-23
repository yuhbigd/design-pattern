package com.design_pattern.structural.decorator;

public abstract class BeverageDecorator implements Beverage {
    private Beverage component;

    public BeverageDecorator(Beverage component) {
        this.component = component;
    }

    protected void callComponentDrink() {
        if (component != null) {
            component.drink();
        }
    }
}


// Concrete Decorators
class Milk extends BeverageDecorator {
    private float percentage;

    public Milk(Beverage component, float percentage) {
        super(component);
        this.percentage = percentage;
    }

    private void stir() {
        System.out.println("stirring with milk");
    }

    @Override
    public void drink() {
        stir();
        callComponentDrink();
        System.out.print(", with milk of richness " + percentage + "%");
    }
}


class IceCubes extends BeverageDecorator {
    private int count;

    public IceCubes(Beverage component, int count) {
        super(component);
        this.count = count;
    }

    private void breakIceIntoCubs() {
        System.out.println("breaking ice ");
    }

    @Override
    public void drink() {
        breakIceIntoCubs();
        callComponentDrink();
        System.out.print(", with " + count + " ice cubes");
    }
}


class Sugar extends BeverageDecorator {
    private int spoons;

    public Sugar(Beverage component, int spoons) {
        super(component);
        this.spoons = spoons;
    }

    @Override
    public void drink() {
        callComponentDrink();
        System.out.print(", with " + spoons + " spoons of sugar");
    }
}
