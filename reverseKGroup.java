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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1) return head;
        int count =0;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode  curr =dummy,  prev =dummy, after=dummy;
        while(curr.next != null){
            curr = curr.next;
            count++;
        }

        while(count >= k){
            curr = prev.next;
            after= curr.next;
            for(int i =1; i<k; i++){
                curr.next = after.next;
                after.next = prev.next;
                prev.next = after;
                after = curr.next;


            }
            prev = curr;
            count -= k;
        }
        return dummy.next;
    }
}
