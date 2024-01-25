package com.design_pattern.behavioral.strategy;

public class CalculateContext {
    private Calculate calculate;

    public void setCalculate(Calculate calculate) {
        this.calculate = calculate;
    }

    int executeStrategy(int a, int b) {
        return calculate.execute(a, b);
    }
}
