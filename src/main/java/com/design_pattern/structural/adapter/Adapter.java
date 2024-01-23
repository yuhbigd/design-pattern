package com.design_pattern.structural.adapter;

/**
 * Adapter
 */
public class Adapter {

    public static void main(String[] args) {
        ISystem oldSystem = new OldSystemAdapter(new OldSystem());
        ISystem newSystem = new CurrentSystem();
        System.out.println(oldSystem.doSomething());
        System.out.println(newSystem.doSomething());
    }
}
