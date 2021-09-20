package com.designpatterns.decorator;

public class Expresso extends Beverage{

    public Expresso(){
        description = "Expresso";
    }

    @Override
    public double cost() {
        return 125.0;
    }
}
