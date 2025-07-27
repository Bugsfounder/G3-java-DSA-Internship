
public class Main {
    int g1;
    final float g2 = 3.13f; // initialization is required

    // Constructor -> a method with the same name as class
    Main() {
        //        int  i ; ==> have initialized with some value, local variables
        int i = 0;
        //        System.out.println("Constructor Called");
        System.out.println(i);
        System.out.println(g1); // this is global variables, works without initialized
        System.out.println(g2); // have to initialize with value
    }

    Main(int param) {
        System.out.println("Integer Value: " + param);
    }

    // static blocks
    static {
        System.out.println("Static block");
    }
    // non-static block --> executes when object is created
    {
        System.out.println("hell");
    }

    public static void main(String[] args) {
        new Main(32); // this is call constructor
        new Main(); // this is call constructor

        //        called without calling or creating object of class, preference is most to static block

        //        preference
        //            static block
        //                  |
        //            non-static block
    }
}
