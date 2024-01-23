package com.design_pattern.structural.bridge;

import java.math.BigDecimal;
import java.math.MathContext;

public class Bridge {
    public static void main(String[] args) {
        Bank vietcomBank = new VietcomBank(new CheckingAccount());
        Bank vietcomBankSaving =
                new VietcomBank(new SavingAccount(new BigDecimal(3.2, MathContext.DECIMAL32)));
        vietcomBank.openAccount();
        vietcomBankSaving.openAccount();
        Bank tpBank = new TPBank(new CheckingAccount());
        tpBank.openAccount();
    }
}
