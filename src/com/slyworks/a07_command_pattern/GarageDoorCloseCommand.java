package com.slyworks.a07_command_pattern;

public class GarageDoorCloseCommand implements Command{
    //region Vars
    private GarageDoor garageDoor;
    //endregion

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
