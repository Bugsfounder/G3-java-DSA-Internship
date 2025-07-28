package com.bugs;

import java.util.ArrayList;
import java.util.List;

public class KatakamDoubt {
//    Suppose we have two objects and we have same types of data
//    how it will work on the calling object and it will ask
//    typesafety as data type to call the object.
    public static void main(String[] args) {
        List<Integer> lst1 = new ArrayList<>();
//        List<Integer> lst2 = new ArrayList<>();
        List<String > lst2 = new ArrayList<>();

         new ArrayList<>().add(1); // how to access this value;
//        lst2.add(10);
        lst2.add("string");

        System.out.println(lst1);
        System.out.println(lst2);
        System.out.println(new ArrayList<>().add(14)); // true
        System.out.println(new ArrayList<>().add("Manisha")); // true

    }
}
