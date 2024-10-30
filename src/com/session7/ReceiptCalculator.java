package com.session7;

import java.util.ArrayList;
import java.util.List;

public class ReceiptCalculator {

    public static double calculateReceipt(List<Drink> drinks){
        double sum = 0;
        for(Drink coffee : drinks){
            sum += coffee.getPriceInDollars();
        }
        return sum;
    }
/**
 * Calculates the total receipt amount for a list of drinks.
 * 
 * @param drinks a list of drinks for which the receipt amount needs to be calculated
 * @return the total amount of the receipt
 */
    public static double calculateRestReceipt(List<Drink> drinks, double payment){
        double sum = 0;
        for(Drink drink : drinks){
            sum += drink.getPriceInDollars();
        }
        return payment-sum;
    }

    public static void main(String[] args) {
        Coffee lattee = new Latte(false);
        Coffee espresso = new Espresso(true);
        MilkShake chocolateMilkShake = new MilkShake();
        MilkShake strawberryMilkshake = new MilkShake();
        List <Drink> drinks = new ArrayList<>();
        drinks.add(lattee);
        drinks.add(espresso);
        drinks.add(chocolateMilkShake);
        drinks.add(strawberryMilkshake);
        System.out.println(calculateReceipt(drinks));
        System.out.println(calculateRestReceipt(drinks, 22.1));
    }

}
