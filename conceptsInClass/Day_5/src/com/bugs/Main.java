package com.bugs;

// create Class outside the Main class
// it is correct to put class inside the main class or any other class, but it is not recommended;
class Inherit
{
    public void print(){
        System.out.println("Hello Sir");
    }
    public int sum(int a,int b){
        return  a + b;
    }

    void property(){
        System.out.println("Property Method");
    }
    protected void property1(){
        System.out.println("Property Method");
    }
}

class Inherited extends Inherit{
    public void print(){
       System.out.println("Hello Sir Again");
    }
}

public class Main {

    public static void main(String[] args) {
        Inherit inherit = new Inherit();
        Inherited inherited = new Inherited();
        inherit.print();
        inherited.print();

        inherit.property();

        inherited.property();

        inherit.property1();

        inherited.property1();


    }
}
