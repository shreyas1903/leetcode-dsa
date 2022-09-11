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
     int max =0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        
        int lh= maxDepth(root.left);
        int rh = maxDepth(root.right);
        
        if(lh+rh>max){
            max = lh+rh;
        }
        return max;
        
    }
    public int maxDepth(TreeNode root){
        if(root == null) return 0;
        //int max =0;
        
        
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        
        return Math.max(lh,rh)+1;
        
        
    }
}
