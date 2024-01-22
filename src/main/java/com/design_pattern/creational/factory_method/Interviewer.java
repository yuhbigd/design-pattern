package com.design_pattern.creational.factory_method;

public interface Interviewer {
    public void askQuestions();
}


class JavaInterviewer implements Interviewer {
    private String javaVersion;
    private int numberOfQuestions;

    public JavaInterviewer(String javaVersion, int numberOfQuestions) {
        this.javaVersion = javaVersion;
        this.numberOfQuestions = numberOfQuestions;
    }

    @Override
    public void askQuestions() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "JavaInterviewer [javaVersion=" + javaVersion + ", numberOfQuestions="
                + numberOfQuestions + "]";
    }
}


class JsInterviewer implements Interviewer {
    private int numberOfQuestions;

    public JsInterviewer(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    @Override
    public void askQuestions() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "JsInterviewer [numberOfQuestions=" + numberOfQuestions + "]";
    }
}
