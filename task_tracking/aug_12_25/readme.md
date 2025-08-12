## Leetcode 120 (optimal solution)
```java
public int minimumTotal(List<List<Integer>> triangle){
    int n = triangle.size();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = triangle.get(n-1).get(i);
    }
    for (int row = n-2; row >= 0; row--) {
        for (int col = 0; col < row; col++) {
            arr[col] = triangle.get(row).get(col)  + Math.min(arr[col], arr[col+1]);
        }
    }
    return arr[0];
}
```
