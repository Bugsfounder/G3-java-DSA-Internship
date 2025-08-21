### Arrays
- Array is a linear data structure that stores data in contiguous memory.
- Fixed size. (limitation)

### LinkedList
- Linear data Structure where data is stored in a sequence of linked nodes.
- No size limitation.
- Node: | data | reference |  --> | another data | reference | --> null
- Not contiguous.
#### Code written in class
```java 
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class MyLinkedList {
    // insert
    Node head;
    public void insert(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    // display
    public void display(){
        Node start = head;
        while (start!=null){
            System.out.print(start.data + "->");
            start = start.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insert(10);
        list.insert(10);
        list.insert(10);
        list.display();
    }
}
```
### TODO
1. Modify this code to insert at the beginning.
2. Count the number of nodes in the LinkedList
