package com.design_pattern.behavioral.strategy;

public interface Calculate {
    int execute(int a, int b);
}


class ConcreteStrategyAdd implements Calculate {

    @Override
    public int execute(int a, int b) {
        return a + b;
    }

}


class ConcreteStrategySubtract implements Calculate {

    @Override
    public int execute(int a, int b) {
        return a - b;
    }

}


class ConcreteStrategyMultiply implements Calculate {

    @Override
    public int execute(int a, int b) {
        return a * b;
    }

}
