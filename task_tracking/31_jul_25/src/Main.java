import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test2{

}
public class Main {
    public static void main(String[] args) {

        // instance of

        List<Integer> lst1 = new ArrayList<>();
        List  lst2 = new ArrayList<>();

//        System.out.println(lst1 +"instanceof if:"+ lst1 instanceof lst2 ); // error java: cannot find symbol, symbol:
        //  class lst2  location: class Main

        System.out.println(lst1 instanceof ArrayList); // true
        System.out.println(lst1 instanceof ArrayList<Integer>); // true
//        System.out.println(lst1 instanceof ArrayList<String>); // error
        System.out.println(lst1 instanceof Object); // true
        System.out.println(lst1 instanceof Test2); // false

        // my Questions answer of sheet
        // we can't access the value 3, but 3 is being stored in memory
        System.out.println(new ArrayList<>().add(3));


    }
}
