import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program88Leetcode {
    static int[] MergeArray(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1;
        for (int i = m + (n - 1); i >= 0; i--) {
            if (p2 < 0) {
                break;
            }
            if (p1 >= 0 && nums2[p2] > nums1[p1]) {
                nums1[i] = nums2[p2];
                p2--;
            } else if (p1 < 0) {
                nums1[i] = nums2[p2];
                p2--;
            } else {
                nums1[i] = nums1[p1];
                p1--;
            }
        }
        return nums1;

    }

    public static void main(String[] args) {

        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> element = new ArrayList<>();
        element.add(10);
        lst.add(element);
        lst.add(element);
        lst.add(element);
        lst.add(element);
        lst.add(element);
        lst.add(element);

        System.out.println(lst);

        System.out.println(Arrays.toString(MergeArray(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3)));
    }
}