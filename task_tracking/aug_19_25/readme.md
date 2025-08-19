### DSA rapid fire context - Auctions
### Waves - World Audio Visual & Entertainment Summit (WAVES)
### TRP - Television Rating Point
### AI importance in other fields

### Two Sum, Optimal Solution
```java
public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> keys = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int key = target - nums[i];
        if (keys.containsKey(key)) {
            return new int[]{keys.get(key), i};
        }
        keys.put(nums[i], i);
    }
    return new int[]{};
}
```

### Leetcode 14 explanation
```java
String sh = {"flower", "flow", "flight"};

Arrays.sort(str);
O/P Sort: "flight", "flow", "flower"

StringBuffer bf = new StringBuffer();
char[] arr1 = str[0].new char[str.length];
char[] arr2 = str[str.length()-1].new char[];

for(int i = 0; i < arr1.length; i++){
    if(arr1[i] != arr2[i]) 
        break;
        
    bf.append(arr[i]);
}
```
### Solution
```java
   public static String longestCommonPrefix(String[] str){
    StringBuffer bf = new StringBuffer();

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

    System.out.println(longestCommonPrefix(str));
} 
```
