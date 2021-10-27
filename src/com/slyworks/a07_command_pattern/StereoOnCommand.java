package com.slyworks.a07_command_pattern;

public class StereoOnCommand implements Command {
    //region Vars
    private Stereo stereo;
    //endregion

    public StereoOnCommand(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
