## Backtracking - N-Queens
1. if you have tree or graph 
   1. Nodes
   2. Edges
2. You can store nodes and edges in a data structure 
   1. Map - key value pairs
3. Since a node can have one or many children(Trees) or neighboring nodes(Graphs) you can use list, (Dynamic array)
4. Key - Primitive data type 
5. Value -  List

```java
Map<Integer, List<Integer>> tree/graph = new HashMap();

public void addEdges(int node1, int node2){ // assuming we are working  with binary trees or each node Graph having only two neighbors

    tree.putIfAbsent(node1, new ArraysList<>());
    tree.putIfAbsent(node2, new ArrayList<>());
        
}
```
