## HashMap
Data Structure to manage data with key value pairs.
```java
public static void main(String[] args) {
    // creating hashMap object
    Map<Integer, Integer> hashMap = new HashMap<>();

    // inserting value into hashMap
    hashMap.put(1,4);
    hashMap.put(2,5);
    hashMap.put(5,2);
    hashMap.put(6,2);
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

    // removing a key value pair, using key
    hashMap.remove(1);

    // printing the hashMap
    System.out.println(hashMap);

    // checking if a key present in the hashMap or not
    System.out.println(hashMap.containsKey(3));
    System.out.println(hashMap.containsValue(3));
}
```
### 2. Which is thread safe in string buffer and string builder in java? 
StringBuffer is thread safe, while StringBuilder is not.

### 3. What is synchronization ? 
* The situation when two or more actions, events, etc. happen at exactly the same time or the act of making this happen.
* A way to manage shared resource, when multiple threads or process trying to access it at the same time.
* It makes a thread or process to wait, for the resource if it is being used by another process or thread.
