package com.bugs;

public class Calculator {
    int a = 0;
    int b = 0;
    static  double PI = 3.14;
    public static int sum(int[] nums) {
       int sum = 0;
        for(int num: nums){
            sum+=num;
        }

        return  sum;
    }

    public int multiply(int a, int b){
        return  a * b;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,2,4}));

        Calculator calculator = new Calculator();

        System.out.println(calculator.multiply(12,12));
    }
}
