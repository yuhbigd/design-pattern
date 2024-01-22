package com.design_pattern.creational.abstract_factory;

public interface HiringPositionManager {
    public Skill getSkill();

    public Interviewer getInterviewer(int numberOfQuestions);
}


class BackendPosition implements HiringPositionManager {

    private String javaVersion;

    public BackendPosition() {}

    public BackendPosition(String javaVersion) {
        this.javaVersion = javaVersion;
    }

    @Override
    public Skill getSkill() {
        // do heavy thing
        return new CompetitiveProgramming();
    }

    @Override
    public Interviewer getInterviewer(int numberOfQuestions) {
        // do heavy thing
        return new JavaInterviewer(javaVersion, numberOfQuestions);
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }
}


class FrontEndPosition implements HiringPositionManager {

    @Override
    public Skill getSkill() {
        return new Photoshop();
    }

    @Override
    public Interviewer getInterviewer(int numberOfQuestions) {
        return new JsInterviewer(numberOfQuestions);
    }
}
