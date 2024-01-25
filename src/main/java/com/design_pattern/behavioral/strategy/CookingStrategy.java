package com.design_pattern.behavioral.strategy;

public interface CookingStrategy {
    void cook();
}


class BakingStrategy implements CookingStrategy {

    public void cook() {
        System.out.println("Baking the dish...");
    }
}


class FryingStrategy implements CookingStrategy {

    public void cook() {
        System.out.println("Frying the dish...");
    }
}


class SteamingStrategy implements CookingStrategy {

    public void cook() {
        System.out.println("Steaming the dish...");
    }
}
