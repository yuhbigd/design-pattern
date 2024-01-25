package com.design_pattern.behavioral.observer;

public interface EventListener {
    void update(String eventType, String event);
}


class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, String event) {
        System.out.println("Email : " + email + " - " + eventType + " - " + event);
    }
}


class LogNotificationListener implements EventListener {

    @Override
    public void update(String eventType, String event) {
        System.out.println("logging: " + eventType + " - " + "event " + event);
    }
}
