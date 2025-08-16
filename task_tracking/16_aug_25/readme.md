## Leetcode: 187 Dna Sequence

```text
Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
Output: ["AAAAACCCCC","CCCCCAAAAA"]

AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT
[AAAAACCCCC]AAAAACCCCCCAAAAAGGGTTT
  1st ans
  
s.substring(i, i+10);
s.substring(0,10);
// o/p: AAAAACCCCC
```
### Solution
```java
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
```

### Constructor 
```text

ArrayList(Collection <? Extends E> C);
Convert the other object type of Collection to ArrayList;
```
