package com.design_pattern.structural.bridge;

public class CheckingAccount implements Account {

    @Override
    public void openAccount() {
        System.out.println("Checking Account");
    }

}
