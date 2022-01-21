/* Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(head != null){
            list.add(head.val);
            head = head.next;        
        }
        int x= list.get(k - 1);
        int y = list.get(list.size() -k);
        
        list.set(k - 1, y);
        list.set(list.size() -k, x);
        
        ListNode heads = new ListNode(list.get(0));
        ListNode temp = heads;
        
        for(int i =1; i < list.size();i++){
            ListNode curr = new ListNode(list.get(i));
            temp.next = curr;
            temp = temp.next;
        }
        return heads;
    }
}
