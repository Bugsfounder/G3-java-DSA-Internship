
public class Main {
    static void print1to10(int i, int n){
//        if (i == n){
        if (i > n){
            return;
        }
        System.out.println(i);
        print1to10(++i, n);
    }

    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
        // return factorial(n-1) * n; // it will also work
    }
    public static void main(String[] args) {
        print1to10(1, 10);
        System.out.println(factorial(5));
    }
}
