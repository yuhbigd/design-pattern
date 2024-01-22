package com.design_pattern.creational.abstract_factory;

public interface Skill {
    public void exposeSkill();
}


class Photoshop implements Skill {

    @Override
    public void exposeSkill() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Photoshop []";
    }

}


class CompetitiveProgramming implements Skill {

    @Override
    public void exposeSkill() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "CompetitiveProgramming []";
    }

}
