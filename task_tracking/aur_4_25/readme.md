## Hashing, leetcode question 219
(95% code is done)
1. Insertion order is not preserved.
2. No dupilcates allowed.
3. Created a hashSet.
4. Added the array elements into a hashset.
5. if - set contains - true
6. check weather it's less than or equals to target
```java
    static boolean solution(int[] arr, int k){
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i< arr.length; i++){
            if (set1.contains(arr[i])){
                return true;
            }
            set1.add(arr[i]);

            if (set1.size() > k){
                set1.remove(arr[i-k]);
            }
        }

        return false;
    }
```

## Can we overlaod main method in java
> Yes we can, but I cannot be directly called by jvm, we manually have to run overridden methods inside main(String[] args), this is the default signature.
```java
public class OverloadingMain {

    public static void main(String[] args) {
        main(23);
        main(new int[12]);
        main('r');
        main();
    }
    public static void main(int[] args) {
        System.out.println("int args");
    }
    public static void main(int a) {
        System.out.println("int val");

    }
    public static void main() {
        System.out.println("blank");

    }
    public static void main(char ch) {
        System.out.println("ch val");
    }
}
```

## can we override static methods in java
> No, we can't override static methods in java.
```java
class Overrride1{
    public void print(){

    }

    public static void prints(){

    }
}
class MainOverload extends Overrride1{
    @Override
    public void print(){

    }

    // static methods cannot be overridden
    @Override // error
    public void prints(){

    }
    @Override // error
    public static void prints(){

    }
}
```
