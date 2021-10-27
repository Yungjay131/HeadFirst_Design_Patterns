package com.slyworks.a07_command_pattern;

public class LightOffCommand implements Command{
    //region Vars
    private Light light;
    //endregion

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
