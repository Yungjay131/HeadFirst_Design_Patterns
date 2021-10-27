package com.slyworks.a07_command_pattern;

public class LightOnCommand implements Command {
    //region Vars
    private Light light;
    //endregion

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute(){
       light.on();
    }

    @Override
    public void undo() {
        light.off();
    }

}
