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
}
