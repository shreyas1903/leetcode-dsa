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
    public ListNode rotateRight(ListNode head, int k) {
       ListNode cur= head;
        ListNode prev = null;
        ListNode count =0;
        while(curr.next != null){
            count++;
            prev = cur;
            cur = cur.next;
           
        }
        prev = cur;
        cur.next = head;
        ListNode k =k % count;
        ListNode loc = count - k;
        for(int i =0; i < loc; i++){
            prev = cur;
            cur = cur.next;
        }
        prev.next = null;
        return cur;
        
    }
   
}
