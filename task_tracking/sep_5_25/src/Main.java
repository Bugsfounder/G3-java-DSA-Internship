public class Main {
    // Using Stack data Structure
    public boolean isPalindrome(ListNode head) {
        ListNode start = head;
        Stack<Integer> s = new Stack();
        while(start != null){
            s.push(start.val);
            start = start.next;
        }

        while(!s.isEmpty() && head != null){
            if(s.pop() != head.val){
                return false;
            }
            head = head.next;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
