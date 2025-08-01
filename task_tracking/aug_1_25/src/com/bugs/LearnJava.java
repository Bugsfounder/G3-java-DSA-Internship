package com.bugs;

class LearnJavaParent{

}
public class LearnJava extends LearnJavaParent{

    public static void main(String[] args) {

        LearnJava obj = new LearnJava();
        Object obj1 = new LearnJava();
        Object obj2 = new Object();

        System.out.println("LearnJava: "+ obj1.hashCode());



    }
}
