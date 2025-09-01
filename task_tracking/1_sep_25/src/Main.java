
public class Main {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello");
        StringBuilder str2 = new StringBuilder("Hello");

        str.append("s");
        System.out.println(str2.charAt(0));
        System.out.println(str.charAt(2));
        System.out.println(str.indexOf("e"));
        System.out.println(str);
    }
}
