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
    public ListNode insertionSortList(ListNode head) {
        ListNode res= new ListNode(-1);
        ArrayList<Integer> hell = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            hell.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(hell);
        ListNode reshead = res;
        for(int i =0; i < hell.size(); i++){
            reshead.next = new ListNode(hell.get(i));
            reshead = reshead.next;
        }
        return res.next;
    }
}
