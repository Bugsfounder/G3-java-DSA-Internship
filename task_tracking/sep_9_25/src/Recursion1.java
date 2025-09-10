
public class Recursion1 {
    public void Recursive1(int n){
        if (n==6){
            return;
        }
        System.out.print(n + 1 +" ");
        Recursive1(n+1);
    }
    public int  Recursive2(int n){
        if (n<=1){
            return n;
        }
        return Recursive2(n-1) + Recursive2(n-2);
    }
    public static void main(String[] args) {
        Recursion1 rec1 = new Recursion1();
//        rec1.Recursive1(0);
        int fib = rec1.Recursive2(6);

        for (int i = 0; i < fib; i++) {
            System.out.print(rec1.Recursive2(i) + " ");
        }
    }
}
