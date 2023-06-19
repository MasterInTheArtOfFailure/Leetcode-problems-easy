class Solution {
    public boolean isPalindrome(ListNode head) {
    if (head.next == null) {
        return true;
    }
    
    Stack<Integer> stack = new Stack<>();
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
        stack.push(slow.val);
        slow = slow.next;
        fast = fast.next.next;
    }
    
    if (fast != null) {
        slow = slow.next;
    }
    
    while (slow != null) {
        if (slow.val != stack.pop()) {
            return false;
        }
        slow = slow.next;
    }
    
    return true;
}
}