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
