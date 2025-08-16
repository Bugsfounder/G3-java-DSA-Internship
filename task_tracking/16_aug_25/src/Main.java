import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public List<String> DnaSeq(String s){
        List<String> ans = new ArrayList<>();
        Set<String> dnaSet = new HashSet<>(), retDnaSet = new HashSet<>();
        for (int i = 0; i + 9 < s.length(); i++) {
            String sub = s.substring(i, i+10);
            if (dnaSet.contains(sub)){
                retDnaSet.add(sub);
            }
            dnaSet.add(sub);
        }
        System.out.println(dnaSet+"\n"+ retDnaSet);
        return new ArrayList<>(retDnaSet);
    }
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";

        System.out.println(s.length());
        System.out.println(s.substring(0,10));

        Main m = new Main();
        m.DnaSeq(s);

    }
}
