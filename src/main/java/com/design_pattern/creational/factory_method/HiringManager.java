package com.design_pattern.creational.factory_method;
public interface HiringManager {
    Interviewer makeInterviewer(int numberOfQuestions);

}


class JavaHiringManager implements HiringManager {
    private String javaVersion;

    public JavaHiringManager(String javaVersion) {
        this.javaVersion = javaVersion;
    }

    @Override
    public Interviewer makeInterviewer(int numberOfQuestions) {
        return new JavaInterviewer(this.javaVersion, numberOfQuestions);
    }

}


class JsHiringManager implements HiringManager {

    @Override
    public Interviewer makeInterviewer(int numberOfQuestions) {
        return new JsInterviewer(numberOfQuestions);
    }

}
