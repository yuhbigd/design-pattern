package com.design_pattern.behavioral.chain_of_responsibility;

public class PurchaseRequest {
    private String description;
    private double amount;

    public PurchaseRequest(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}
