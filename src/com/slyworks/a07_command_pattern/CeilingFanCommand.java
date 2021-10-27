package com.slyworks.a07_command_pattern;

public class CeilingFanCommand implements Command {
    //region Vars
    private CeilingFan ceilingFan;
    private Speed previousSpeed;
    //endregion


    public CeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
       previousSpeed = ceilingFan.getSpeed();
       ceilingFan.setCeilingFanSpeed(Speed.HIGH);
    }

    @Override
    public void undo() {
       ceilingFan.setCeilingFanSpeed(previousSpeed);
    }
}
