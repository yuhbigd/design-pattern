package com.design_pattern.behavioral.command;

// Receiver class
class TV {
    boolean isOn = false;

    public void turnOn() {
        if (!isOn) {
            System.out.println("TV is ON");
            isOn = true;
        } else {
            System.out.println("TV is already ON");
        }
    }

    public void turnOff() {
        if (isOn) {
            System.out.println("TV is OFF");
            isOn = false;
        } else {
            System.out.println("TV is already OFF");
        }
    }
}


