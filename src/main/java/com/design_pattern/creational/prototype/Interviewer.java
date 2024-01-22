package com.design_pattern.creational.prototype;

public interface Interviewer extends Cloneable {
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
}
