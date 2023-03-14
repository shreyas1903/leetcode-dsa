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
        int totsum ;

    public int sumNumbers(TreeNode root) {
        totsum =0;
        dfs(root, 0);
        return totsum;
    }

    public void dfs(TreeNode root, int total){
        if(root == null)return;
        // int sum=0;
        total = total*10+root.val;
        if(root.left == null && root.right == null){
            totsum += total;
            return ;
        }
        dfs(root.left,total);
        dfs(root.right,total);
    }
}
