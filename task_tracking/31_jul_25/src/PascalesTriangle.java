import java.util.ArrayList;
import java.util.List;

public class PascalesTriangle {
    public static List<Integer> getRow(int n){
        List<Integer> row = new ArrayList<>();

        long val = 1;
        row.add((int)val); // First element is always 1
        for (int i = 1; i <= n; i++) {
            val = val * ((n-i)+1)/i;
            row.add((int)val);
        }
        return row;
    }
    public static void main(String[] args) {
        System.out.println(getRow( 6));
    }
}
