package com.slyworks.a07_command_pattern;

public class CeilingFan {
    //region Vars
    private String room;
    private Speed speed = Speed.OFF;
    //endregion


    public CeilingFan(String room) {
        this.room = room;
    }

    public void setCeilingFanSpeed(Speed _speed){
        speed = _speed;
    }

    public Speed getSpeed(){
        return speed;
    }
}
