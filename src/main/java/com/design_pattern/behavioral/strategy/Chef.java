package com.design_pattern.behavioral.strategy;

public class Chef {
    private CookingStrategy cookingStrategy;

    public void setCookingStrategy(CookingStrategy cookingStrategy) {
        this.cookingStrategy = cookingStrategy;
    }

    public void CookDish() {
        System.out.println("Preparing the dish...");
        cookingStrategy.cook();
        // Additional steps for dish preparation
        System.out.println("Dish is ready!");
    }
}
