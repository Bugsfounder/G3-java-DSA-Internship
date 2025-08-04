class Overrride1{
    public void print(){

    }

    public static void prints(){

    }
}
class MainOverload extends Overrride1{
    @Override
    public void print(){

    }

    // static methods cannot be overridden
//    @Override
//    public void prints(){
//
//    }
//    @Override
//    public static void prints(){
//
//    }
}

public class OverloadingMain {

    public static void main(String[] args) {
        main(23);
        main(new int[12]);
        main('r');
        main();
    }
    public static void main(int[] args) {
        System.out.println("int args");
    }
    public static void main(int a) {
        System.out.println("int val");

    }
    public static void main() {
        System.out.println("blank");

    }
    public static void main(char ch) {
        System.out.println("ch val");
    }
}
