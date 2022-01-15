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
    public ListNode deleteMiddle(ListNode head) {
        ListNode a = head;
        ListNode b = head;
        ListNode prev = null;
        
        while(b!= null && b.next != null){
            
            prev = a;
            a = a.next;
            b= b.next.next;

            
        }
        prev.next=a.next;
        return head;
    }
}
