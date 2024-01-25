package com.design_pattern.behavioral.observer;

public class Editor {
    public EventManager events;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void open(String message) {
        events.notify("open", message);
    }

    public void save() {
        events.notify("save", "save something");
    }
}
