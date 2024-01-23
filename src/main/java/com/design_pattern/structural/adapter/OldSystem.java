package com.design_pattern.structural.adapter;

public class OldSystem {
    public StringBuilder doSomething() {
        return new StringBuilder("something old");
    }
}
