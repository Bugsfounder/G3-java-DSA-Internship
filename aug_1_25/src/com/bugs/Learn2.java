package com.bugs;

public class Learn2 {
    public static void main(String[] args) {
        String str1 = "Manisha";
        String str2 = "Manisha";
//        String str2 = "Manisha1";

        String str3 = new String("Shalini");
        String str4 = new String("Shalini");
//        String str4 = new String("Shalini1");

        System.out.println("str1 equals str2?? " + str1.equals(str2));
        System.out.println("str3 equals str4?? " + str3.equals(str4));

        System.out.println(str1==str2); // true
        System.out.println(str3==str4); // false
        System.out.println(" " +str1==str2); // false
        System.out.println(" " +(str1==str2)); // true

        System.out.println("str1 equals str2?? " + str1 == str2); // false
        System.out.println("str1 equals str2?? " + (str1 == str2)); // true
        System.out.println("str3 equals str4?? " + str3==str4); // false
        System.out.println("str3 equals str4?? " + (str3==str4)); // false

    }
}
