package com.slyworks.a07_command_pattern;

public class NoCommand implements Command {
    @Override
    public void execute() { }

    @Override
    public void undo() { }
}
