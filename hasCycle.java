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
    public boolean hasCycle(ListNode head) {
        if(head == null) 
            return false;
        
        var slowPtr = head;
        var fastPtr = head.next;
        
        while(fastPtr != slowPtr){
            if(fastPtr == null || fastPtr.next == null)
                return false;
            
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return true;
    }
}
