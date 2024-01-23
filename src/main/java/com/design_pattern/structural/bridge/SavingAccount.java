package com.design_pattern.structural.bridge;

import java.math.BigDecimal;

public class SavingAccount implements Account {
    private BigDecimal savingRate;

    public SavingAccount(BigDecimal savingRate) {
        this.savingRate = savingRate;
    }

    @Override
    public void openAccount() {
        System.out.println("saving account with " + savingRate.toPlainString() + " saving rate");
    }
}
