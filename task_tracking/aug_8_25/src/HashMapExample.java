import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // creating hashMap object
        Map<Integer, Integer> hashMap = new HashMap<>();

        // inserting value into hashMap
        hashMap.put(1,4);
        hashMap.put(5,2);
        hashMap.put(6,2);
        hashMap.put(2,5);
        hashMap.put(7,3);
        hashMap.put(8,3);

        // printing the hashMap
        System.out.println(hashMap);

        // accessing values in hashMap
        System.out.println(hashMap.get(1));
        hashMap.getOrDefault(6, 4); // output : 2, default is not taken, because the value(2) of key 6 is present
        System.out.println(hashMap.getOrDefault(10, 43)); // we are trying to get value of 10, which is not present
        // in our hashmap, then it is printing the default value instead of giving error, key not present

        // updating a particular key value pair
        System.out.println(hashMap.replace(5,3));
        System.out.println(hashMap.replace(20,3));

        // removing a key value pair, using key
        hashMap.remove(1);
        hashMap.remove(20);

        // printing the hashMap
        System.out.println(hashMap);

        // checking if a key present in the hashMap or not
        System.out.println(hashMap.containsKey(3));
        System.out.println(hashMap.containsValue(3));
    }
}
