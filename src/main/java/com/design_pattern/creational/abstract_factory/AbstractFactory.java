package com.design_pattern.creational.abstract_factory;

public class AbstractFactory {
    static class FactoryMaker {

        public enum Position {
            BACKEND, FRONTEND
        }

        public static HiringPositionManager makeFactory(Position type) {
            return switch (type) {
                case BACKEND -> new BackendPosition("17.0.1");
                case FRONTEND -> new FrontEndPosition();
                default -> throw new IllegalArgumentException("KingdomType not supported.");
            };
        }
    }

    public static void main(String[] args) {
        HiringPositionManager backend = FactoryMaker.makeFactory(FactoryMaker.Position.BACKEND);
        Interviewer backendInterviewer = backend.getInterviewer(10);
        Skill backendSkill = backend.getSkill();
        backendInterviewer.askQuestions();
        backendSkill.exposeSkill();
    }
}
