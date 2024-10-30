package com.session7;

public interface Brewable {
    int a = 10;

    int getBrewingTimeInSeconds();
    default int getMilkQuantity(){return 0;};

    boolean isBlack();

    static String showCoffeShopInfo(){return "This is Laila's coffee shop";}

}
