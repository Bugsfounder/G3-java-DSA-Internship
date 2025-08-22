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
```java
// add at beginning
public void addAtBeginning(int data){
    Node newNode = new Node(data);
    if (head==null){
        head = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
    System.out.println(head.data); // head is now pointing to newNode
}
```
2. Count the number of nodes in the LinkedList
```java
// count number of nodes
public int countNoOfNodes(){
    Node start = head;
    int count = 0;
    while (start!=null){
        count++;
        start = start.next;
    }
    return count;
} 
```
main
```java
public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();
    list.insert(10);
    list.insert(10);
    list.insert(10);
    list.display();

    list.addAtBeginning(20);
    list.display();

    System.out.println(list.countNoOfNodes());

}
```
output
```java 
10->10->10->null
20
20->10->10->10->null
4
```
