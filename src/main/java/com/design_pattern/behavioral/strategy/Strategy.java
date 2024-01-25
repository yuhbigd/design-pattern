package com.design_pattern.behavioral.strategy;

import java.util.Scanner;

public class Strategy {
    // v1
    // public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // CalculateContext calculateContext = new CalculateContext();
    // int choice = scanner.nextInt();
    // switch (choice) {
    // case 1:
    // calculateContext.setCalculate(new ConcreteStrategyAdd());
    // break;
    // case 2:
    // calculateContext.setCalculate(new ConcreteStrategySubtract());
    // break;
    // case 3:
    // calculateContext.setCalculate(new ConcreteStrategyMultiply());
    // break;
    // default:
    // break;
    // }
    // int a = scanner.nextInt();
    // int b = scanner.nextInt();
    // System.out.println(calculateContext.executeStrategy(a, b));
    // scanner.close();
    // }
    // v2
    public static void main(String[] args) {
        Chef chef = new Chef();

        // Create different cooking strategies
        CookingStrategy bakingStrategy = new BakingStrategy();
        CookingStrategy fryingStrategy = new FryingStrategy();
        CookingStrategy steamingStrategy = new SteamingStrategy();
        chef.setCookingStrategy(bakingStrategy);
        chef.CookDish(); // The dish will be baked

        // Set the frying strategy
        chef.setCookingStrategy(fryingStrategy);
        chef.CookDish(); // The dish will be fried

        // Set the steaming strategy
        chef.setCookingStrategy(steamingStrategy);
        chef.CookDish(); // The dish will be steamed
    }
}
