package com.design_pattern.creational.prototype;

public interface Skill extends Cloneable {
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

    @Override
    protected Photoshop clone() throws CloneNotSupportedException {
        // shallow clone
        return (Photoshop) super.clone();
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

    @Override
    protected CompetitiveProgramming clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return (CompetitiveProgramming) super.clone();
    }

}
