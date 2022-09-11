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
    public boolean result = true;
    
    public boolean isBalanced(TreeNode root) {
        max(root);
        return result;
    }
    public int max(TreeNode root){
        
        if(root == null) return 0;
        int l = max(root.left);
        int r = max(root.right);
        
        if(Math.abs(l - r)>1)result = false;
        return 1+Math.max(l,r);
        //return result;
    }
}
