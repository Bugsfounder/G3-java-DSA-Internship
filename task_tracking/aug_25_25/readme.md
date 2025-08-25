# OOPS (Object oriented programming)
- Object based programming.
- A class has methods and member variables.
```text
properties --> variables
behaviours --> methods();
```
- Visualize:
```text

Car: (blueprint)
    - color
    - brand
    - drive

Note: we can create any number of class using this Car blueprint
```
## Pilers
1. Encapsulation
Putting a lot of methods and properties, and wrap it into a capsule, people don't need to know what's inside.
```java
class Student{
    getfunc - get value;
    setfunc - set name;
}

main{
    getfunc();
    setfunc("Manisha");
}
```
2. Inheritance
```java
class Animal {
  void eat(){
    
  }
}

class Dog extends Animal {
  void bark(){
    
  }
  
 // we don't need to create eat method again, it is already here in Dog class 
}
```
3. Polymorphism
creating multiple class with same name;
* Compile time
```java 
class MathUtils{
  int add(int a, int b){
    return a + b;
  }
  
  double add(double a, double b){
    return a + b;
  }
} 
```
* Runtime
```java 
class Dog extends Animal{
  @override
  void sound(){
  // ...
  }
}
public static void main(){
  Animal animal = new Dog();
  animal.sound();
}
```
4. Abstraction
Hiding implementation details.
```text
Abstract classes
interfaces 
```
## SOLID Principle
[SOLID Principles with Real Life Examples, Liskov's Substitution Principle, Open/Closed Principle, etc](https://www.geeksforgeeks.org/system-design/solid-principle-in-programming-understand-with-real-life-examples/)
## ACBDA pattern
## MVC framework
