import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    // n
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> itemsAndIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (itemsAndIndex.containsKey(key)) {
                return new int[] { itemsAndIndex.get(key), i };
            }
            itemsAndIndex.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static int[] twoSumNLogN(int[] nums, int target) {
        int arr[][] = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int sum = arr[start][0] + arr[end][0];
            if (sum == target) {
                return new int[] { arr[start][1], arr[end][1] };
            }
            if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        int target = 6;
        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));

        //        int[] res = twoSum(new int[]{2,7,11,15}, 9);
        //        int[] res = twoSum(new int[]{3,2,4}, 6);
        // int[] res = twoSum(new int[]{3,3}, 6);
        // System.out.println(Arrays.toString(res));
    }
}
