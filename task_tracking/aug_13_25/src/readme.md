## 3. Longest Substring Without Repeating Characters
1. no duplicates of a substring allowed
2. calculate the substring not subsequence
3. return the size of longest substring

```
pwwkew
| p | w | w | k | e | w |
| 0 | 1 | 2 | 3 | 4 | 5 |
```

```java
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
```
## Dynamic memory allocation
```text
vectors<> --> dynamic memory allocation

Overhead tanks -- arrays memory - Array index out of bound
capacity - 1000L
size - 1000L

size == capacity -> grow according to the properties of that particular data structure

example:
Hashing --> once size reaches 75% of capacity
    Load factors - * 2
Vectors --> capacity == size, double size * 2 

ArrayList(int initialCapacity) --> constructor
ArrayList<Integer> lst = new ArrayList<>(20); // initial capacity is 20
```
