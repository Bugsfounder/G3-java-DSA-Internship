package com.bugs;

class Company{
    void getCompanyName(){
        System.out.println("Company Name");
    }
}

class Amazon extends Company{
    @Override
    void getCompanyName() {
        System.out.println("Amazon");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Company cm = new Company();
        Company ama = new Amazon();
        ama.getCompanyName();
        cm.getCompanyName();
    }


}
