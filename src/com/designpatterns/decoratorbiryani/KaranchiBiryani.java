package com.designpatterns.decoratorbiryani;

public class KaranchiBiryani extends Biryani{

    public KaranchiBiryani(){
        description="Karanchi Biryani";
    }


    @Override
    public double cost() {
        return 300.0;
    }
}
