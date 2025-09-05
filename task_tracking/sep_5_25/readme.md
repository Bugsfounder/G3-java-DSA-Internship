## 234. Palindrome Linked List
- time O(n) and space O(n) --> not optimal
```java
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
```
- Using two pointers, fast and slow pointers
- To find optimal solution

https://leetcode.com/problems/palindrome-linked-list/

## ping, pooling etc
