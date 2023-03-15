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
    public boolean isCompleteTree(TreeNode root) {
        if(root == null)return true;

        Queue<TreeNode> res = new LinkedList(Arrays.asList(root));
        while(res.peek() != null){
            TreeNode he = res.poll();
            res.offer(he.left);
            res.offer(he.right);

        }

        while(!res.isEmpty() && res.peek() == null){
           res.poll();
        }

        return res.isEmpty();
    }
}
