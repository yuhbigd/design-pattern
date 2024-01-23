package com.design_pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public interface MilitaryUnit {
    void deploy();
}


// Leaf: Soldier
class Soldier implements MilitaryUnit {
    private String name;

    public Soldier(String name) {
        this.name = name;
    }

    @Override
    public void deploy() {
        System.out.println("Soldier " + name + " is deployed.");
    }
}


// Composite: Platoon
class Platoon implements MilitaryUnit {
    private List<MilitaryUnit> soldiers = new ArrayList<>();

    public void addSoldier(MilitaryUnit soldier) {
        soldiers.add(soldier);
    }

    @Override
    public void deploy() {
        System.out.println("Deploying platoon:");
        for (MilitaryUnit soldier : soldiers) {
            soldier.deploy();
        }
    }
}


// Composite: Company
class Company implements MilitaryUnit {
    private List<MilitaryUnit> platoons = new ArrayList<>();

    public void addPlatoon(MilitaryUnit platoon) {
        platoons.add(platoon);
    }

    @Override
    public void deploy() {
        System.out.println("Deploying company:");
        for (MilitaryUnit platoon : platoons) {
            platoon.deploy();
        }
    }
}


// Composite: Battalion
class Battalion implements MilitaryUnit {
    private List<MilitaryUnit> companies = new ArrayList<>();

    public void addCompany(MilitaryUnit company) {
        companies.add(company);
    }

    @Override
    public void deploy() {
        System.out.println("Deploying battalion:");
        for (MilitaryUnit company : companies) {
            company.deploy();
        }
    }
}
