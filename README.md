# G3-java-DSA-Internship

### TypeSafety

    - generics are used for type safety

```java
import java.lang.reflect.Type;

class Test2{
    public  void print(){
        // base logic
    }
}

public class TypeSafety<T>  extends Test2{


    @Override
    public  void print(){
        // overriding base logic --> different from base
    }


    TypeSafety(T course){
        System.out.println(course);
    }


    public static void main(String[] args) {
        TypeSafety<String >s1 = new TypeSafety<String >("DSA in JAVA");
        TypeSafety<Integer>s2 = new TypeSafety<Integer>(1);
        TypeSafety<Float>s3 = new TypeSafety<>(23.4f);
        TypeSafety<Boolean>s4 = new TypeSafety<>(true);
        TypeSafety<Character>s5 =  new TypeSafety<>('r');
    }
}
```

## Method Hiding

```java

class Hiding{

    // can possible to method hiding with print function,
    // in subclass, have to be a method static to do method hiding.

    //    public  void print(){
    //        // base logic
    //    }

    // static method can be used to do method hiding
    public static   void print(){
        // base logic
        System.out.println("Super class");
    }
}
public class MethodHidingJava extends Hiding{

    public static void print(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {

        MethodHidingJava subClass = new MethodHidingJava();
        print();
        Hiding.print();
    }
}

```

## Other definitions

    - method hiding: when subclass and superclass have a static method with the same name is known as method hiding.
    - overriding: changing an existing method of superclass in subclass with the different logic.
    - overloading: creating multiple methods with same name, with different signatures.

## Final - Constants

```java
public class FinalInJava {

    public static void main(String[] args) {
        final int b = 22;
//        b = 34; // error;


    }


    // javac is responsible for compile time error
    // JVM is responsible for runtime error;
}
```

## method declaration

```java
public abstract  class DeclarationOfMethod {

    // it is not possible to declare methods without an abstract in classes, to declare a method in a class it has to
    // be abstract, method inside abstract class only.

    // possible
    public abstract void exam();

    // not possible
    // public  void exam();


    int a ;
    abstract  int example();

    //    you can initialize variables and other things but cannot be declared;
    //    System.out.println("Hello"); // wrong;

    public static void main(String[] args) {
        // class is a keyword defined by user;
        int a = 15;
    }

    // abstract method cannot be defined;
    // class should be abstract to create abstract method into it;
    // any method will define it should be defined by abstract keyword;
}
```

## Diff b/w interface and class in case of abstract

```java
interface interface1{

    public void print();
    int a = 10;
    // can't do
    /*
    public void print1(){
        System.out.println("Hello");
    }
    */

}

abstract class Class1{
//    public void print(); // error

    public abstract void print(); // correct

    // can do
    public void print1(){
        System.out.println("Hello");
    }
}

public class DiffInterfaceAndClass_Abstract {
    public static void main(String[] args) {

    }
}

```

Note: Interface is a type where the methods are by default abstract and data members (variables) are static and final;
