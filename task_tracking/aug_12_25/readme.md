## Leetcode 120 (optimal solution)

```java
public int minimumTotal(List<List<Integer>> triangle){
    int n = triangle.size();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = triangle.get(n-1).get(i);
    }
    for (int row = n-2; row >= 0; row--) {
        for (int col = 0; col <= row; col++) {
            arr[col] = triangle.get(row).get(col)  + Math.min(arr[col], arr[col+1]);
        }
    }
    return arr[0];
}
```

### Dry run

```java
Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]

Output: 11

Explanation: The triangle looks like:

   2

  3 4

 6 5 7

4 1 8 3

The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).

n = 4;
arr = [0,0,0,0]

// inserting last row of triangle into arr;
for i in range(n)
    arr[i] = triangle[n-1][i]

arr = [4,1,8,3]

for row = 4-2; row >= 0; row--
    for col = 0; col <= row; col++

FOR row = 2
    FOR col = 0 (col <= row) true
        arr[0] = triangle[2][0] + min(arr[0], arr[0+1])
                    [6]         +       [1]                 min(4,1)
        arr = [7, 1, 8, 3]

    FOR col = 1 (col <= row) true
        arr[1] = triangle[2][1] + min(arr[1], arr[1+1])
                    [5]         +       [1]                 min(5,1)
        arr = [7, 6, 8, 3]

    FOR col = 2 (col <= row) true
        arr[1] = triangle[2][2] + min(arr[2], arr[2+1])
                    [7]         +       [3]                 min(8,3)
        arr = [7, 6, 10, 3]

    FOR col = 3 (col <= row) false

FOR row = 1
    FOR col = 0 (col <= row) true
        arr[0] = triangle[1][0] + min(arr[0], arr[0+1])
                    [3]         +       [6]                 min(7,6)
        arr = [9, 6, 10, 3]

    FOR col = 1 (col <= row) true
        arr[1] = triangle[1][1] + min(arr[1], arr[1+1])
                    [4]         +       [6]                 min(5,10)
        arr = [9, 10, 10, 3]

    FOR col = 2 (col <= row) false

FOR row = 0
    FOR col = 0 (col <= row) true
        arr[0] = triangle[0][1] + min(arr[0], arr[0+1])
                    [2]         +       [9]                 min(9, 10)
        arr = [11, 10, 10, 3]

    FOR col = 1 (col <= row) false

FOR row = -1 (row >=0) false

END

at the end we have answer at, arr[0]


```
