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
    public ListNode sortList(ListNode head) {
        ListNode hell = new ListNode(-1);
        ArrayList<Integer> res = new ArrayList<>();
        ListNode temp= head;
        while(temp != null){
            
            res.add(temp.val);
            temp = temp.next;
        }
        
        Collections.sort(res);
        ListNode hellhead= hell;
        for(int i=0; i < res.size(); i++){
            hellhead.next = new ListNode(res.get(i));
            hellhead= hellhead.next;
        }
        return hell.next;
    }
}
