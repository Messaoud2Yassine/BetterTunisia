package com.session10;

import java.util.function.Function;

public class App{

    private int age;
    public int getAge(){
        return age;
    }

    public App(int age){
        this.age = age;
    }

    <T> T test(T a, T b){
        return a;
    }

public static void main(String[] args) {
    Function<String , Integer> f = (s)->s.length();
    System.out.println(f.apply("Laila"));

}
}
