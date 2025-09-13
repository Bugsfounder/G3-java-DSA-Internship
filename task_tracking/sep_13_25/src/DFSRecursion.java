import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// program for adding edges in a graph
public class DFSRecursion {
    Map<Integer, List<Integer>> tree = new LinkedHashMap();

    public void addEdge(int node1, int node2){
        tree.putIfAbsent(node1, new ArrayList<>());
        tree.putIfAbsent(node2, new ArrayList<>());
        tree.get(node1).add(node2);
        tree.get(node2).add(node1);
        for (Map.Entry<Integer, List<Integer>> entry : tree.entrySet()){
            System.out.println(entry.getKey() + "---->" + entry.getValue());
        }
    }
    public static void main(String[] args) {
//        LinkedHashMap obj = new LinkedHashMap();
//        obj.put("a", "b");
//        obj.put("c", "d");
//        obj.put("e", "f");
//        obj.put("g", "h");

//        System.out.println(obj);

        DFSRecursion df = new DFSRecursion();
        df.addEdge(1,2);
        df.addEdge(2,1);
        df.addEdge(2,3);

    }
}
