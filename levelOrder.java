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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> res = new LinkedList<TreeNode>();
        List<List<Integer>> ds = new LinkedList<>();
        if(root == null) return ds;
        res.offer(root);
        while(!res.isEmpty()){
            int n = res.size();
            ArrayList<Integer> sublist = new ArrayList<>();
            for(int i =0;i<n;i++){
                if(res.peek().left != null) res.offer(res.peek().left);
                if(res.peek().right != null) res.offer(res.peek().right);
                sublist.add(res.poll().val);
            }
            ds.add(sublist);
        }
        return ds;
    }
}
