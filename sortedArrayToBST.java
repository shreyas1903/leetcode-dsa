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
    public TreeNode sortedArrayToBST(int[] nums) {
        return hell(0,nums.length-1, nums);
    }
    public TreeNode hell(int start, int end, int[] nums){
        if(nums.length == 0 || nums == null) return null;
        if(start>end) return null;
        
        int mid = (start+end)/2;
        
        TreeNode root = new TreeNode(nums[mid]);
        root.left = hell(start, mid-1, nums);
        root.right = hell(mid+1, end, nums);
            return root;
    }
}
