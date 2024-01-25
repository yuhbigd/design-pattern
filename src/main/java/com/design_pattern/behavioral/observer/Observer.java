package com.design_pattern.behavioral.observer;

public class Observer {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new EmailNotificationListener("abc@g.com"));
        editor.events.subscribe("save", new EmailNotificationListener("abc@g.com"));
        editor.events.subscribe("save", new LogNotificationListener());
        editor.save();
        editor.open("test message");
    }
}
