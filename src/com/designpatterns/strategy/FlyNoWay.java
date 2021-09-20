package com.designpatterns.strategy;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("FlyNoWay - Can't Fly");
    }
}
