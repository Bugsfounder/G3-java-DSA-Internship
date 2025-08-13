import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] arr = new int[n]; // [11,10,10,3]

        for (int i = 0; i < n; i++) {
            arr[i] = triangle.get(n - 1).get(i);
        }

        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                arr[col] = triangle.get(row).get(col) + Math.min(arr[col], arr[col + 1]);
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {

        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(2));
        lst.add(Arrays.asList(3, 4));
        lst.add(Arrays.asList(6, 5, 7));
        lst.add(Arrays.asList(4, 1, 8, 3));

        // System.out.println(lst);

        System.out.println(minimumTotal(lst));

    }
}
