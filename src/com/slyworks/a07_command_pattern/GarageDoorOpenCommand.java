package com.slyworks.a07_command_pattern;

public class GarageDoorOpenCommand implements Command{
    //region Vars
    private GarageDoor garageDoor;
    //endregion

    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
