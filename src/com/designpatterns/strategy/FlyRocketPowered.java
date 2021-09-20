package com.designpatterns.strategy;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Flying with Rocket !!");
    }
}
