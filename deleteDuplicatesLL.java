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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
            
        }
        ListNode dummy = new ListNode(0);
        ListNode slow, fast;
        slow = dummy;
        while(head != null){
            fast = head.next;
            while(fast != null && (fast.val == head.val)) fast = fast.next;{
                if(head.next ==fast){
                    slow.next = head;
                    fast = slow.next;
                    slow.next = null;
                }
                head = fast;
            }
        }
        return dummy.next;
        
    }
}
