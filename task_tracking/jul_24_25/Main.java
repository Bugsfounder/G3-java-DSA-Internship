
// package task_tracking.jul_24_25;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int[] num1 = { 1, 2, 3, 0, 0, 0 };
        int[] num2 = { 2, 5, 6 };

        merge(num1, 3, num2, 3);
        System.out.println(Arrays.toString(num1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }

        Arrays.sort(nums1);
    }
}
