/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode head = headA;
        ListNode tail = headB;
        while(headB != null){
            while(headA != null){
                if(headA == headB){
                    return headA;
                }
                headA = headA.next;
            }
            headB = headB.next;
            headA = head;
        }
        return null;
        
    }
}
