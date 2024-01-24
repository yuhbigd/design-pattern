package com.design_pattern.behavioral.command;

public class Main {
    public static void main(String[] args) {
        // client
        TV tv = new TV();
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);

        // Set up the invoker
        RemoteControl remote = new RemoteControl();

        // Press the ON button
        remote.setCommand(0, tvOnCommand, tvOffCommand);
        remote.pressSlot(0);
        remote.pressUndo();
        remote.pressRedo();
    }
}
