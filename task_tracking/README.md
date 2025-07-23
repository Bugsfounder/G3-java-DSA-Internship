# Class Concepts

WEEK -1

- <b>What AI can do?</b> - Automate and predict things
- <b>Fiber optic cables</b> - Fastest mode of data transmission
- <b>Nautic miles </b> - Unit to measure Sea distance
- <b>Situation Behavior Impact (SBI) in resume building</b>
- <b>Evolution in AI</b>
  - Artificial intelligence
  - Artificial general intelligence
  - Artificial Super intelligence
- <b>What is data ?</b> Raw or unprocessed information
- <b>What is information? </b>Processed data or Refined data
  - EG: Vegetables is a data
- <b>Process</b> - Cut vegetables, prepare Sambar - Information

WEEK -2

- <b>Type casting</b> - Convert one type to another . Type here in this context is class or interface
  - <b>Upcasting</b> - Converting subclass reference to Super interface reference or class object
  - <b>Downcast</b> - Converting the upcasted reference back to to subclass object
- <b>Overriding</b>
  Inheritance is mandatory
  Same method signature in Super class and sub class but change in the method definition in sub class
- <b>Generics</b> - Java 8+ feature. (8+ here means JDK version 8 and above)
  - Used for Type safety purpose
- Class is a blueprint or user defined datatype
- Object is a real world entity

WEEK -3

1.  Leet Code - Two Sum - O(n^2) approach

```java
public int[] twoSum(int[] nums, int target) {

    int arr[]=new int[2];

    for(int i=0;i<nums.length;i++)
    {
        for(int j=i+1;j<nums.length;j++)
        {
            if(nums[i]+nums[j]==target)
            {
                arr[0]=i;
                arr[1]=j;
            }
        }
    }

    return arr;

}
```

2. <b>Leet Code</b> - Remove duplicates from sorted array - Two pointer approach

```java
public static int removeDuplicates(int[] arr)
{
    int i=0;
    for(int j=1; j<arr.length;j++)
    {
        if (arr[i]!=arr[j])
        {
            i++;
            arr[i] = arr[j];
        }
    }
    return i+1;
}
```

3. <b>Leet Code</b>- Best time to buy stock - Two pointer approach

```java
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            if(minPrice>price){
                minPrice = price;
            }else{
               maxProfit =  Math.max(price-minPrice, maxProfit);
            }
            // maxProfit = Math.max(maxProfit, price-minPrice);
            // minPrice = Math.min(price, minPrice);
        }
        return maxProfit;
    }
}
```

4. Cookies
   - Cookies are a form of consent taken from the user by a website and are stored in the browser’s cache memory.
   - They are not hidden files, but they aren’t easily visible to regular users. Though accessible through browser tools, cookies can be misused if not managed properly, which may lead to privacy concerns.
   - However, when used correctly, cookies are not harmful — they actually help improve user experience by remembering preferences, keeping users logged in, and personalizing the website.
   - In short, cookies beautifully enhance how we interact with websites.
