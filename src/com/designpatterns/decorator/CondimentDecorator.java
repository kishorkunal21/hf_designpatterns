package com.designpatterns.decorator;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;// decorator wrapping the beverages

    public abstract String getDescription();
}
