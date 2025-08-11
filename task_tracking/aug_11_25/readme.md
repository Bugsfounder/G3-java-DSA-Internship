# Threads in java

## FunctionalInterface
* Should contain only one method declaration
* Data members are allowed, but has to be initialized

```java
// FunctionalInterface can contain only one method declaration
@FunctionalInterface // annotations
interface Functional
{
    // int datadec; // not allowed
    int datadec = 10;
    public void function();
    // public void function(int a); // compile time error
}
```

### start() method
* begin the execution of thread.
* it is synchronized.

### Two ways to create thread
1. extending the Thread class
2. implementing the Runnable interface

### code written in class
```java
// FunctionalInterface can contain only one method declaration
@FunctionalInterface // annotations
interface Functional
{
//    int datadec; // not allowed
    int datadec = 10;
    public void function();
//    public void function(int a); // compile time error
}

//public class Threads1 extends Thread {
public class Threads1 implements Runnable {
    @Override
    public void  run()
    {
        for (int i = 1; i < 10; i++){
            System.out.println("Run method of thread class" + i);
        }
    }
    public static void main(String[] args) {

//        Thread t1 = new Thread(); // not work
//        Thread t1 = new Threads1(); // work
//        Thread t1 = new Thread();
//        Threads1 t2 = new Threads1();
//        t1.start();
//        t2.start();

        Threads1 t3 = new Threads1();
        Thread t1 = new Thread(t3);
        t1.start();
    }
}
``
