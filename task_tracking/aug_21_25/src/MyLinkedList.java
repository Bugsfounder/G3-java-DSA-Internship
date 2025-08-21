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
