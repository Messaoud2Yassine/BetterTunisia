package com.session11;

import java.util.ArrayList;
import java.util.List;

public class App {

List<String> names;
List<Person> persons;
List<Thinker> thinkers;
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Laila");
        names.add("Ahmed");
        names.add("Yassine");
        names.add("Ali");
        names.sort((name1,name2)->name2.compareTo(name1));
        System.out.println(names);
    }
}
