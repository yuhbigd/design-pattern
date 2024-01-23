package com.design_pattern.structural.adapter;

public class OldSystemAdapter implements ISystem {
    private OldSystem oldSystem;

    public OldSystemAdapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public String doSomething() {
        return oldSystem.doSomething().toString();
    }

}
