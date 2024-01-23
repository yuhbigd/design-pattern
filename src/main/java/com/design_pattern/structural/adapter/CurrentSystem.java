package com.design_pattern.structural.adapter;

public class CurrentSystem implements ISystem {

    @Override
    public String doSomething() {
        return "something new";
    }

}
