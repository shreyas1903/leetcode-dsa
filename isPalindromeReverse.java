/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
       if(head == null && head.next == null){
           return head;
       }
       ListNode prev = null;
       ListNode curr = head;
       ListNode after = curr.next;
       while(curr != null){
           curr.next = prev;
           prev = curr;
           curr = after;
           if(after != null){
               after = after.next;
           }

       }
       return prev;
        
    }
    public ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast =head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode middle = middle(head);
        ListNode first = head;
        ListNode second = reverse(middle);
        while(first != null && second != null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
        
    }
}
