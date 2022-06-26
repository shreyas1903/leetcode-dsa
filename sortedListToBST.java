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
        return hell(0, res.size()-1, res);
    }
    public TreeNode hell(int start , int end ,List<ListNode> list){
        if(start > end) return null;
        
        int mid = start +(end - start)/2;
        
        TreeNode root = new TreeNode(list.get(mid).val);
        root.left = hell(start, mid-1, list);
        root.right = hell(mid+1, end, list);
        
        return root;
    }
}
