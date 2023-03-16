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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = inorder.length;
        return hell(inorder,0,len-1,postorder,0,len-1);
    }

    public TreeNode hell(int[] inorder,int instart, int inend ,int[] postorder, int postart, int poend){
        if(instart > inend) return null;

        int rootval = postorder[poend];
        TreeNode root = new TreeNode(rootval);

        int rootind = instart;
        for(;rootind<= inend;rootind++){
            if(inorder[rootind] == rootval){
                break;
            }
        }

        int left = rootind - instart;
        int right = inend - rootind ;



        root.left=hell(inorder,instart, rootind - 1,postorder, postart,postart+left-1);
        root.right=hell(inorder,rootind+1, inend,postorder, poend - right,poend-1);
        return root;
    }
}
