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
        HashSet<ListNode> res = new HashSet<>();
        ListNode set = null;
        while(headA!= null){
            res.add(headA);
            headA = headA.next;
        }

        while(headB!=null){
            if(res.contains(headB)){
                set = headB;
                break;
            }
            headB= headB.next;
        }
        return set;
    }
}
