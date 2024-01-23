package com.design_pattern.structural.facade;

public class Facade {
    public static void main(String[] args) {
        var computer = new ComputerFacade(new Computer());
        computer.turnOn();
        System.out.println("<=======================>");
        computer.turnOff();
    }
}
