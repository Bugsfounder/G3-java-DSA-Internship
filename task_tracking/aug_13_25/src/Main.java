import java.util.HashSet;
import java.util.Set;

public class Main {

    public int lengthOfLongestSubstring(String str) {
        int l = 0, r = 0, max = 0;
        Set<Character> ch = new HashSet<>();
        for(int i = 0; i < str.length();i++)
        {
            if (!ch.contains(str.charAt(r)))
            {
                ch.add(str.charAt(r));
                r++;
                max = ch.size();
            }
            ch.remove(r);
            l++;
        }
        return max;
    }
    public static void main(String[] args) {

    }
}
