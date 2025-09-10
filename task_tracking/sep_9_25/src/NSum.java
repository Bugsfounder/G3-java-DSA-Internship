public class NSum {

    int sum(int n, int s){
        if (n == 0){
            return s;
        }
        return sum(n-1, s+n);
    }
    public static void main(String[] args) {
//        NSum obj = new NSum();
//        int res = obj.sum(5,0);
        int res =  new NSum().sum(5, 0);
        System.out.println(res);

        // left skewed tree, right skewed tree
    }
}
