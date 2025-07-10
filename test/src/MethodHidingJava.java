
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

// method hiding --> when subclass and superclass have a static method with the same name is known as method hiding.
// overriding --> changing an existing method of superclass in subclass with the different logic.
// overloading --> creating multiple methods with same name, with different signatures.
