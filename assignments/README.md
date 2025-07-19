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
public int Maxprofit(int[] prices)
{
    int profit = 0, lp=0 ;
    int maxprofit=0;

    for(int hp=1; hp<prices.length;hp++){
        if(prices[lp]< prices[hp])
        {
            maxprofit = prices[hp] - prices[lp];
            profit= Math.max(profit,maxprofit);
        }
        else
        {
            lp=hp;
            }
        }
    return profit;
}
```
