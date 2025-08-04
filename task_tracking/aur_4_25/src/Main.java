import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    static boolean isDuplicate(int[] arr){

        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i< arr.length; i++){
            if (set1.contains(arr[i])){
                return true;
            }
            set1.add(arr[i]);
        }

        return false;
    }
    static boolean solution(int[] arr, int k){
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i< arr.length; i++){
            if (set1.contains(arr[i])){
                return true;
            }
            set1.add(arr[i]);

            if (set1.size() > k){
                set1.remove(arr[i-k]);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        List<Integer> lst = new ArrayList<>();

        lst.add(12);
        lst.add(20);
        lst.add(15);
        lst.add(15);

        set.add(12);
        set.add(20);
        set.add(15);
        set.add(15);
        System.out.println(set);
        System.out.println(lst);

        int[] arr = {100,23, 70, 21, 200, 350, 200, 138, 100, 23, 200};

//        System.out.println(isDuplicate(arr));
        System.out.println(solution(new int[]{1,2,3,1}, 3));

    }
}
