package org.lesson1;

import com.session1.App;

public class MySecondTest extends App{
    int age;
    boolean isPresent;

    public MySecondTest(int age){

    }
    public static void main(String[] args) {
        MySecondTest mySecondTest = new MySecondTest(10);
        System.out.println(mySecondTest.isPresent);
    }

   
}
