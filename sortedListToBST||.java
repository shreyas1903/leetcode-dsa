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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        List<ListNode> res = new ArrayList<>();
        while(head != null){
            res.add(head);
            head = head.next;
        }

        return wtf(res, 0, res.size()-1);
    }

    public TreeNode wtf(List<ListNode> what, int start, int end){
        if(start > end) return null;
        int mid =  start + (end-start)/2 ;
        TreeNode list = new TreeNode(what.get(mid).val);
        list.left = wtf(what,start,mid-1);
        list.right = wtf(what, mid+1, end);
        return list;


        

    }
}
