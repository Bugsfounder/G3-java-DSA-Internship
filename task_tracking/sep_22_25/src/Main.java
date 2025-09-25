import java.util.ArrayList;
import java.util.List;

public class Main {

    public void takeCombination(int index, int[] arr, int target, List<List<Integer>> comb, List<Integer> addComb){

        if(index == arr.length){
            if (target==0)
                comb.add(new ArrayList<>(addComb));
            return;
        }

        if (arr[index] <= target){
            addComb.add(arr[index]);
            takeCombination(index, arr, target-arr[index], comb, addComb);
            addComb.remove(addComb.size()-1); // Backtracking , Error and trial
        }

        takeCombination(index+1, arr, target, comb, addComb);
    }

    public List<List<Integer>> combination(int[] arr, int target){
        List<List<Integer>>  comb = new ArrayList<>();
        takeCombination(0, arr, target, comb, new ArrayList<>());
        return comb;
    }

    public static void main(String[] args) {
        Main m = new Main();
        List<List<Integer>> res =  m.combination(new int[]{2,3,6,7}, 6);
        System.out.println(res);
    }
}
