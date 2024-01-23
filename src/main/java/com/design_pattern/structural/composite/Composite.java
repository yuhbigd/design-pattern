package com.design_pattern.structural.composite;

public class Composite {
    public static void main(String[] args) {
        // Create individual soldiers
        Soldier soldier1 = new Soldier("1");
        Soldier soldier2 = new Soldier("2");
        Soldier soldier3 = new Soldier("3");

        // Create a platoon and add soldiers
        Platoon platoon = new Platoon();
        platoon.addSoldier(soldier1);
        platoon.addSoldier(soldier2);
        platoon.addSoldier(soldier3);

        // Create a company and add the platoon
        Company company = new Company();
        company.addPlatoon(platoon);

        // Create a battalion and add the company
        Battalion battalion = new Battalion();
        battalion.addCompany(company);

        // Deploy the entire battalion
        battalion.deploy();
    }
}
