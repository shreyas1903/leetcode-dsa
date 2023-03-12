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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length <= 0){
            return null;
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =0;i<lists.length;i++){
            while(lists[i] != null){
                res.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        Collections.sort(res);
        ListNode head = null;
        ListNode tail = null;
        // now creat a linkedlist
        
        for(int i =0;i<res.size();i++){
            ListNode result = new ListNode(res.get(i));
            if(head == null){
                head = result;
                tail = result;
            }
            else{
                tail.next = result;
                tail = tail.next;
                
            }
        }
        return head;

    }
}
