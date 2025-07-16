import java.util.Arrays;

public class RemoveDuplicates
{
    public  static int removeDuplicates(int[] nums) {
        int i = 0;

        for(int j = 1; j < nums.length; j++){
            if (nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
//                nums[j] = _;
            }
//            else{
//                nums[j] = -1;
//            }
        }
        return i+1;
    }
    public static void main(String[] args) {

//        int[] arr = {1,1,2};
        int[] arr = {0,0,1,1,1,2,2,3,3,4};

        int res = removeDuplicates(arr);
        System.out.println(res);
        System.out.println(Arrays.toString(arr));

    }
}
