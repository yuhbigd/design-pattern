package com.design_pattern.behavioral.command;

import java.util.ArrayDeque;

// Invoker class
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private ArrayDeque<Command> undoStack;
    private ArrayDeque<Command> redoStack;
    private int slots = 3;

    public RemoteControl() {
        onCommands = new Command[slots];
        offCommands = new Command[slots];
        undoStack = new ArrayDeque<>();
        redoStack = new ArrayDeque<>();

    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        // slot between 0..2, neither commands can be nll
        if (onCommand == null || offCommand == null) {
            throw new IllegalArgumentException("Commands cannot be null!");
        } else {
            onCommands[slot] = onCommand;
            offCommands[slot] = offCommand;
        }
    }

    public void pressSlot(int slot) {
        onCommands[slot].execute();
        undoStack.addFirst(onCommands[slot]);
    }

    public void unPressSlot(int slot) {
        offCommands[slot].execute();
        undoStack.addFirst(offCommands[slot]);
    }

    public void pressUndo() {
        if (!undoStack.isEmpty()) {
            var command = undoStack.pollFirst();
            redoStack.addFirst(command);
            command.undo();
        }
    }

    public void pressRedo() {
        if (!redoStack.isEmpty()) {
            var command = redoStack.pollFirst();
            undoStack.addFirst(command);
            command.redo();
        }
    }
}
