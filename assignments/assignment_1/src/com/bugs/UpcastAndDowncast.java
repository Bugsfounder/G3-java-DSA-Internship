package com.bugs;

class Animal {
    void sound(){
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog Sound");
    }
}

public class UpcastAndDowncast {
    public static void main(String[] args) {
        // upcasting
        Animal dog = new Dog();
        dog.sound(); // work

//        dog.bark(); // error: No candidates found for method call dog.bark().

        // downcast
        Dog d = (Dog) dog;
        d.bark(); // correct no error

        Dog d1 = new Dog();
        d1.bark();
    }
}
