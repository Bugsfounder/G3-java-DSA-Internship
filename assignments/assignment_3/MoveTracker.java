package assignments.assignment_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoveTracker {
    public static List<Integer> SortByFrequency(int[] moves){
        // variables
        Map<Integer, Integer> movesMap = new HashMap<>();
        int average = 0;
        List<Integer> res = new ArrayList<>();
        // iterate over all moves and add into movesMap, if move already present do ++;
        for (int move : moves){
            if (movesMap.containsKey(move)){
                movesMap.replace(move, movesMap.get(move)+1);
            }else{
                movesMap.put(move, 1);
            }
        }

        // finding average
        for (int item : movesMap.values()){
            average+=item;
        }
        average = average/ movesMap.size();

        // check values less than average and remove them
        for (int key: movesMap.keySet()){
            if (movesMap.get(key) < average){
                movesMap.remove(key);
            }
        }

        // for debugging
        System.out.println(average);
        System.out.println(movesMap);

        // sort keys based on values in descending order,
        // if more than one values are same, then arrange keys in ascending order.
        return res;
    }

    public static void main(String[] args) {
        int[] input = new int[]{2, 3, 2, 4, 3, 2, 5, 4};
        List<Integer> lst  =  SortByFrequency(input);
    }
}
