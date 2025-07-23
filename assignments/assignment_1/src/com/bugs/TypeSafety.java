package com.bugs;
import java.util.List;
import java.util.ArrayList;

public class TypeSafety<T> {
    // generics are used for typesafety
    void print(T a, T b){
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        TypeSafety<Integer> typeSafety = new TypeSafety<>();
        typeSafety.print(12,23);

        List<Integer> studentMarks = new ArrayList<>();
        List<String> studentName = new ArrayList<>();
        studentMarks.add(34);

//        studentMarks.add("Manisha"); // error

        studentName.add("Manisha"); // no error


        // type safety with variables
        // correct
        int a = 32;
        char grade = 'A';
        String name = "Manisha";
        System.out.println(a+grade);
        System.out.println(a+name);
        System.out.println(a+name);

        char ch = 32; // not error assigned ASCII Value Associated with the respective value (32)

        // incorrect --> error
//        int num = "Value"; // assign value of the same type associated with the variable
//        char chs = 32.3; // error -> no ASCII Code associated with this value
//        String name = 32;
    }
}
