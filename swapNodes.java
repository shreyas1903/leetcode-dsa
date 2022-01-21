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
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(head != null){
            list.add(head.val);
            head = head.next;        
        }
        for(int i =0; i <list.size();i++){
            for(int j =list.size() - 1; j >=0; j--){
                if(k == list.get(i)){
                    int temp = list.get(i);
                    list.add(i, list.get(j - i));
                    list.add(j, temp);
                }
            }
        }
        return head;
    }
}
