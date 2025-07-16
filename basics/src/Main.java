import java.util.Arrays;

public class Main {

    public static int[] twoSumProblem(int[] arr, int target){
        int[] arr2 = new int[2];
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i]+arr[j] == target){
                    arr2[0] = i;
                    arr2[1] = j;
                }
            }
        }
        return arr2;
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end -  start) / 2;

            if(arr[mid] == target){
                return mid;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 12;
        System.out.println(Arrays.toString(twoSumProblem(arr, target)));
    }
}
