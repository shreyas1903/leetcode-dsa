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
    List<Integer> res = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        formlist(root);
        int i=0;
        int j =res.size() - 1;
       
        while(i<j){
             int sum = res.get(i)+res.get(j);
            if(sum == k){
                return true;
            }
            else if(sum < k)
                i++;
            else 
                j--;
        }
        return false;
    }
    public void formlist(TreeNode root){
        if(root != null){
            formlist(root.left);
            res.add(root.val);
            formlist(root.right);
        }
    }
}
