package com.design_pattern.behavioral.command;

interface Command {
    void execute();

    void undo();

    void redo();
}


class TVOnCommand implements Command {
    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }

    @Override
    public void undo() {
        tv.turnOff();
    }

    @Override
    public void redo() {
        this.execute();
    }
}


class TVOffCommand implements Command {
    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }

    @Override
    public void undo() {
        tv.turnOn();
    }

    @Override
    public void redo() {
        this.execute();
    }
}
