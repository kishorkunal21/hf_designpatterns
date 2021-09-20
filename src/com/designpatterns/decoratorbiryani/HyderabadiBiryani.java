package com.designpatterns.decoratorbiryani;

public class HyderabadiBiryani extends Biryani{

    public HyderabadiBiryani(){
        description="Hyderabadi Biryani";
    }

    @Override
    public double cost() {
        return 350.0;
    }
}
