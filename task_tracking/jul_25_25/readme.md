## Leet code 88 in complexity of O(n)

```java
int p1 = m-1, p2 = n – 1

for( int i = m+(n-1);  i >= 0; i--)
{
    If(p2<0)
    {
        Break;
    }
    If(p1>=0 && nums2[p1] > nums1[p2])
    {
        Nums1[I] = nums2[p2];
        p2--;
    }else if(p1 < 0){
        Nums1[I] = nums2[p2];
        p2--;
    }
    else{
        nums1[I] = nums1[p1];
        p1--;
    }
}

```

### iterations:

```
Iteration 1:

6>3 ? -> true
nums1[5] = 6;


Iteration 2:

5>3? True
nums[4] = 5;


Iteration 3:
2 > 3 ? False
:
Nums1[3] = 3;


Iteration 4:
2 > 2 false
Nums1[2] = nums[2]


Iteration 5:
2>1 ? True
```

### WorkupQuestion

```java
List<List<Integer>>  lst = new List<>();    [X] // wrong, because List is an interface not an class to create object from it.

List<List<Integer>>  lst = new ArrayList<>();     [✓] // correct
[[10][10][10][10][10]]
List<List<Integer>> lst = new ArrayList<>();
List<Integer> element = new ArrayList<>();
element.add(10);
lst.add(element);
lst.add(element);
lst.add(element);
lst.add(element);
lst.add(element);
lst.add(element);

System.out.println(lst);

// or we can use loop, i < 5 and add it.


// Learn Hashing -> dictionary, or objects in python and javascript (key value pairs) just know the working and syntax
```
