package com.designpatterns.decoratorbiryani;

public abstract class Biryani {

    protected String description ="No Description";

    public abstract double cost();

    public String getDescription(){
        return description;
    }

}
