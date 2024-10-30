package com.session7;

public abstract class Coffee implements Brewable, Drink{

    boolean isIced;
    public Coffee(){}

    public Coffee(boolean isIced){
        this.isIced = isIced;
    }
    protected abstract String getType();

    
    public static void main(String[] args) {
        Coffee coffee = new Espresso(false);
         System.out.println(Brewable.showCoffeShopInfo());
    }
    

}
