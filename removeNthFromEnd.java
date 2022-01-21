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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list=new ArrayList<>();
        ListNode ptr = head;
        int i =0;
        while(ptr != null){
            list.add(ptr);
            ptr = ptr.next;
        }
        
        
        
        if(list.size() == n)
            head=head.next;
        
        else
            list.get(list.size() - n -1).next = list.get(list.size() - n).next;
        return head;
    
    }
}
