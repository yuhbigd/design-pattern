package com.design_pattern.structural.bridge;

public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    public abstract void openAccount();
}


class VietcomBank extends Bank {

    public VietcomBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.print("Open your account at VietcomBank is a ");
        account.openAccount();
    }
}


class TPBank extends Bank {

    public TPBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.print("Open your account at TPBank is a ");
        account.openAccount();
    }
}
