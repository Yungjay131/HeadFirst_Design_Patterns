package com.slyworks.a07_command_pattern;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SimpleRemoteControl {
    //region Vars
    private Command slot;

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;
    //endregion

    public SimpleRemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        undoCommand = noCommand;

        Arrays.stream(onCommands)
              .forEach( c -> c = noCommand );
        Arrays.stream(offCommands)
              .forEach( c -> c = noCommand );
    }

    public void setCommand(Command command){
        slot = command;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButtonPress(){
        slot.execute();
    }

    public void onButtonPress(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    //region Correct Buttons to use
    public void onButtonWasPressed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    public void undoButtonWasPressed(){ undoCommand.undo(); }
    //endregion

    public <T> void onButtonPress(T commandType){

    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n-----REMOTE CONTROL--------\n");

        for (int i = 0; i < onCommands.length; i++) {
                  sb.append("[slot "+i + "]"+onCommands[i].getClass().getName()+
                          " "+offCommands[i].getClass().getName() + "\n");
        }

        IntStream.range(0, onCommands.length)
                .forEach( c ->{ });

        return sb.toString();
    }
}
