package com.session7;

public class Latte extends Coffee{

    public Latte(boolean isIced){
        super(isIced);
    }

    @Override
    protected String getType(){
        return "Latte";
    }

    @Override
    public double getPriceInDollars(){
        return 4.2;
    }

    @Override
    public boolean isBlack(){
        return false;
    }

    @Override
    public int getBrewingTimeInSeconds(){return 60;}
    @Override
    public int getMilkQuantity(){return 200;}

}
