## String Doubts
## Written program
```java
package com.bugs;

public class Learn2 {
    public static void main(String[] args) {
        String str1 = "Manisha";
        String str2 = "Manisha";
//        String str2 = "Manisha1";

        String str3 = new String("Shalini");
        String str4 = new String("Shalini");
//        String str4 = new String("Shalini1");

//        System.out.println("str1 equals str2?? " + str1.equals(str2));
//        System.out.println("str3 equals str4?? " + str3.equals(str4));

        System.out.println(str1==str2); // true
        System.out.println(str3==str4); // false
        System.out.println(" " +str1==str2); // false
        System.out.println(" " +(str1==str2)); // true

        System.out.println("str1 equals str2?? " + str1 == str2); // false
        System.out.println("str1 equals str2?? " + (str1 == str2)); // true
        System.out.println("str3 equals str4?? " + str3==str4); // false
        System.out.println("str3 equals str4?? " + (str3==str4)); // false

    }
}
```
Output:
```console
true
false
false
 true
false
str1 equals str2?? true
false
str3 equals str4?? false
```

### Doubts regarding the above program
1. `System.out.println(str1==str2); // true` but `System.out.println(" " +str1==str2); // false`.
```java
    System.out.println(str1==str2); // true
    System.out.println(str3==str4); // false
    System.out.println(" " +str1==str2); // false
    System.out.println(" " +(str1==str2)); // true
```
*Assumed*:
```
Assumptions:
* [str1==str2] giving true but [" " +str1==str2] giving false and again [" " +(str1==str2)] is giving true.

         Assumed:
         " " +str1==str2 --> [" " + str1] == str2 --> " Manisha" == "Manisha"
        // maybe this is the reason of response false here.
```

2. Why messages are ignored.
```java
    System.out.println("str1 equals str2?? " + str1 == str2); // false
    System.out.println("str1 equals str2?? " + (str1 == str2)); // true
    System.out.println("str3 equals str4?? " + str3==str4); // false
    System.out.println("str3 equals str4?? " + (str3==str4)); // false 
```
```
Output:
false
str1 equals str2?? true
false
str3 equals str4?? false

Expected:
str1 equals str2?? false
str1 equals str2?? true
str3 equals str4?? false
str3 equals str4?? false
```
