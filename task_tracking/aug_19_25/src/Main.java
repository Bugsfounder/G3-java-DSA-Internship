import java.util.Arrays;

public class Main {
    public static String longestCommonPrefix(String[] str){
        StringBuffer bf = new StringBuffer();
        Arrays.sort(str);
        // it will convert strings to character (.toCharArray())
        char[] arr1 = str[0].toCharArray();
        char[] arr2 = str[str.length-1].toCharArray();

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i])
                break;

            bf.append(arr1[i]);
        }

        return bf.toString();
    }
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
//        String[] str = {"ab", "a"};

        System.out.println(longestCommonPrefix(str));
    }
}
