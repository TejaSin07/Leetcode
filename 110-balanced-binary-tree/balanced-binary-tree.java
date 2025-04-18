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
    int a = 0; 
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        helper(root);
        if(a== -1)return false;
        return true;

    }

    public int helper(TreeNode root){
        if(root == null) return 0;
        
        int left = helper(root.left);
        int right = helper(root.right);

        if(Math.abs(left - right) >1){
            a = -1;
        }
        return  Math.max(left,right)+1;
    }
}