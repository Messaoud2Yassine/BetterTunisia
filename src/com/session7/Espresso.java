package com.session7;

public class Espresso extends Coffee{

    public Espresso(boolean isIced){
        super(isIced);
    }

    @Override
    protected String getType(){
        return "Espresso";
    }

    @Override
    public double getPriceInDollars(){
        return 3.9;
    }
    @Override
    public boolean isBlack(){
        return true;
    }

    public int getBrewingTimeInSeconds(){return 30;}

}
