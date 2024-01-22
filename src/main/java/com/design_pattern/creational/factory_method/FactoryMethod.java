package com.design_pattern.creational.factory_method;

public class FactoryMethod {
    public static void main(String[] args) {
        HiringManager javaHiringManager = new JavaHiringManager("17.0.1");
        Interviewer javaInterviewer = javaHiringManager.makeInterviewer(10);
        javaInterviewer.askQuestions();

        HiringManager jsHiringManager = new JsHiringManager();
        Interviewer jsInterviewer = jsHiringManager.makeInterviewer(10);
        jsInterviewer.askQuestions();
    }

}
