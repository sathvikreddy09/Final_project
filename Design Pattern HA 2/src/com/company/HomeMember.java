package com.company;

public class HomeMember extends Observer {
    @Override
    public void update() {
        System.out.println("Home member updated about home owner actions");
    }
}
