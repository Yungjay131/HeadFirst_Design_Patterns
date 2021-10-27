package com.slyworks.a07_command_pattern;

public class StereoOffCommand implements Command{
    //region Vars
    private Stereo stereo;
    //endregion

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
