package com.slyworks.a07_command_pattern;

import java.util.Arrays;

public class MacroCommand implements Command{
    //region Vars
    private Command[] commands;
    //endregion

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        Arrays.stream(commands)
              .forEach( Command::execute );
    }

    @Override
    public void undo() {

    }
}
