package com.session11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Person implements Comparable<Person>{
    int age;
    String name;
    public Person(int age){
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        if(this.age > p.age){
            return 1;
        }else if(this.age < p.age){
            return -1;
        }else{
            return 0;
        }
    }
    @Override
    public String toString() {
        return String.valueOf(age);
    }
public static void main(String[] args) {
    Person p1 = new Person(10);
    Person p2 = new Person(7);
    Person p3 = new Person(27);
    Person p4 = new Person(15);
    List<Person> persons = new ArrayList<>();
    persons.add(p1);persons.add(p2);persons.add(p3);persons.add(p4);

    Stream<Person> s =  persons.stream().sorted((a,b)->-a.compareTo(b));
    List<Person> newList = s.collect(Collectors.toList());

    
    System.out.println(newList);
}
}