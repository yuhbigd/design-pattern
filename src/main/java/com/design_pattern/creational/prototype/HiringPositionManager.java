package com.design_pattern.creational.prototype;

public interface HiringPositionManager {
    public Skill getSkill();

    public Interviewer getInterviewer(int numberOfQuestions);
}


class BackendPosition implements HiringPositionManager {

    private String javaVersion;
    private JavaInterviewer javaInterviewer;
    private CompetitiveProgramming competitiveProgramming;

    public BackendPosition() {}

    public BackendPosition(String javaVersion) {
        this.javaVersion = javaVersion;
        javaInterviewer = new JavaInterviewer(javaVersion, 0);
        competitiveProgramming = new CompetitiveProgramming();
    }

    @Override
    public Skill getSkill() {
        // do heavy thing
        try {
            return competitiveProgramming.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return competitiveProgramming;
    }

    @Override
    public Interviewer getInterviewer(int numberOfQuestions) {
        // do heavy thing
        try {
            var interviewer = (JavaInterviewer) javaInterviewer.clone();
            interviewer.setNumberOfQuestions(numberOfQuestions);
            return interviewer;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return javaInterviewer;
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
