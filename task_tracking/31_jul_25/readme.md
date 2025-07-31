## Instance of
Used to check if an instance belongs to a class or not
```java
 // instance of

        List<Integer> lst1 = new ArrayList<>();
        List  lst2 = new ArrayList<>();

//        System.out.println(lst1 +"instanceof if:"+ lst1 instanceof lst2 ); // error java: cannot find symbol, symbol:
        //  class lst2  location: class Main

        System.out.println(lst1 instanceof ArrayList); // true
        System.out.println(lst1 instanceof ArrayList<Integer>); // true
//        System.out.println(lst1 instanceof ArrayList<String>); // error
        System.out.println(lst1 instanceof Object); // true
        System.out.println(lst1 instanceof Test2); // false
```
## Clear code features
1. No comments
2. Naming convention
3. Separate logic in methods

## recursion requirements
1. Base condition
2. Logic
3. Recursive method call


## Pascale Triangle - 119

```text
            1       --> 0
          1   1     --> 1
         1  2  1    --> 2
        1  3  3 1   --> 3
       1 4  6  4 1  --> 4

val = val * (n-i+1)/i;
```
```java
public static List<Integer> getRow(int n){
    List<Integer> row = new ArrayList<>();

    int val = 1;
    row.add(val); // First element is always 1
    for (int i = 1; i < n; i++) {
        val = val * ((n-i)+1)/i;
        row.add(val);
    }
    row.add(1);
    return row;
}
```
