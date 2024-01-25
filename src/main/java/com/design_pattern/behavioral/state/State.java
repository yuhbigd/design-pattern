package com.design_pattern.behavioral.state;

public interface State {

    void onEnterState();

    void observe();

    public static void main(String[] args) {
        var mammoth = new Mammoth();
        mammoth.observe();
        mammoth.timePasses();
        mammoth.observe();
        mammoth.timePasses();
        mammoth.observe();
    }
}


class PeacefulState implements State {

    private final Mammoth mammoth;

    public PeacefulState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void observe() {
        System.out.println(mammoth + " is calm and peaceful.");
    }

    @Override
    public void onEnterState() {
        System.out.println(mammoth + " calm down");
    }
}


class AngryState implements State {

    private final Mammoth mammoth;

    public AngryState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void observe() {
        System.out.println(mammoth + " is furious!");
    }

    @Override
    public void onEnterState() {
        System.out.println(mammoth + " gets angry!");
    }
}
