/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // tortoise and rabbit method
        ListNode fast = head;
        ListNode slow = head;
        boolean found = false;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                found = true;
                break;
            }
        }
        if(!found) return null;
        fast = head;
        while(slow != head){
            head = head.next;
            slow = slow.next;
        }
        return head;
    }
}
