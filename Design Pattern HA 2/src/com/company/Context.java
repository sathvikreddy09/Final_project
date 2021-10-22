package com.company;

public class Context {
    private TurnOnOffHomeAppliance turnOnOffHomeAppliance;

    public Context(TurnOnOffHomeAppliance turnOnOffHomeAppliance) {
        this.turnOnOffHomeAppliance = turnOnOffHomeAppliance;
    }

    public void turnOnOff(String name) {
        turnOnOffHomeAppliance.turnOnOff(name);
    }
}
