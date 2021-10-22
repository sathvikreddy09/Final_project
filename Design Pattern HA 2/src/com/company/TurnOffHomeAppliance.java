package com.company;

public class TurnOffHomeAppliance implements TurnOnOffHomeAppliance{
    @Override
    public void turnOnOff(String applianceName) {
        System.out.println(applianceName + " has been turned OFF by home owner!");
    }
}
