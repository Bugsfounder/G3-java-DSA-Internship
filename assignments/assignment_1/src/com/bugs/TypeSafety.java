package com.bugs;

public class TypeSafety<T> {
    // generics are used for typesafety

    void print(T a, T b){
        System.out.println(a+" "+b);

    }

    public static void main(String[] args) {
        TypeSafety<Integer> typeSafety = new TypeSafety<>();
        typeSafety.print(12,23);


    }
}
