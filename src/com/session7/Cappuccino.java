package com.session7;

public class Cappuccino extends Coffee{

    @Override
    public int getBrewingTimeInSeconds() {
        return 100;
    }

    @Override
    public double getPriceInDollars() {
        return 5.0;
    }

    @Override
    public boolean isBlack() {
        return false;
    }

    @Override
    protected String getType() {
        return "Cappuccino";
    }

}
