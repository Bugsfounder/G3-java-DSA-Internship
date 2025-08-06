import java.util.ArrayList;
import java.util.List;

public class Main {
    // not debugged, need to verify if it is correct or not for all test cases
    public static int minimumTotal(List<List<Integer>> triangle) {
        int sum = 0;
        int minIndex = 0;
        for (int i = 0; i < triangle.toArray().length; i++) {
            if (triangle.get(i).toArray().length == 1){
                sum += triangle.get(i).get(minIndex);
                minIndex = minIndex;
                if (triangle.toArray().length == 1){
                    return sum;
                }
            }
            else if (i < triangle.toArray().length-1){
                if (triangle.get(i).get(minIndex) > triangle.get(i).get(minIndex+1)){
                    sum += triangle.get(i).get(minIndex+1);
                    minIndex = minIndex+1;
                }else{
                    sum += triangle.get(i).get(minIndex);
                    minIndex = minIndex;
                }
            }else{
                sum += triangle.get(i).get(minIndex);
            }
        }
        return  sum;
    }
    public static void main(String[] args) {
//        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
//        List<Integer> lst = new ArrayList<>();
//        lst.add(2);
//      triangle.add(lst);
//        int minPath = minimumTotal();
//        System.out.println(minPath);

        if (-2 > -3){
            System.out.println(true);
        }
    }
}
