## Recursion
A method calls itself inside its own body, to solve a problem.
### Method types
1. void
2. Primitive data types or class type

```java
public void methodCall()
{
    // base condition
        // mandatory to have returned in base condition
    // action/task
    // recursion call
}

public int methodCall();
```
### Program written
```java 

public class Main {
    static void print1to10(int i, int n){
//        if (i == n){
        if (i > n){
            return;
        }
        System.out.println(i);
        print1to10(++i, n);
    }

    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
        // return factorial(n-1) * n; // it will also work
    }
    public static void main(String[] args) {
        print1to10(1, 10);
        System.out.println(factorial(5));
    }
}
```
### Assignment: 
> `14.` Longest Common Prefix
