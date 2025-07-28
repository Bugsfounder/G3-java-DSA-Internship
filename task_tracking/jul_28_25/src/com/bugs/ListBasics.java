package com.bugs;

import java.util.ArrayList;
import java.util.List;

public class ListBasics {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<List<Integer>>(); // []

        List<Integer> lst1= new ArrayList<>(); // []
        lst1.add(1); // [1] - 0th index
        System.out.println(lst1); // [1]

//        list.add(new ArrayList<>().add(32)); // error
        list.add(new ArrayList<>()); // no error

        list.add(lst1); // [ [1] ]
        System.out.println(list);
        System.out.println(list.get(0));

        new ArrayList<>().add(3);
        System.out.println(new ArrayList<>());
//        for (int i = 0; i < 5; i++) {
//            List<Integer> lst = new ArrayList<>();
//            lst.add(i);
//            list.add(lst);
//        }
//        System.out.println(list);
    }
}
