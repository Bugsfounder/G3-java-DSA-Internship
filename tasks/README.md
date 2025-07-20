# Tasks

### Todo For 20-july-25 [sunday]

1. Create a class
2. Create a static method
3. Create a non static method
4. Create a static data member
5. Create a non static data member

> Note: class should include the main method

- Read about Tokens, JDK, JVM , Inheritance and come

### Solution:

```java
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
```
