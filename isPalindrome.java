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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> l1 = new ArrayList<>();
        while(head != null){
            l1.add(head.val);
            head = head.next;
        }
        
        int i = 0;
        int j = l1.size() - 1;
        while(i < j){
            if(l1.get(i) != l1.get(j)){
                
                return false;
            }
            i++;
            j--;
            
        }
        return true;
        
    }
}
