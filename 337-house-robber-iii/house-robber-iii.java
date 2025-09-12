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
    public int rob(TreeNode root) {
        int dp[] = helper(root);

        return Math.max(dp[0],dp[1]);
    }


    private static int [] helper(TreeNode root){
        if(root == null)return new int[2];

        int [] left = helper(root.left);
        int [] right = helper(root.right);

        int res [] = new int [2];

        //take root val
        res[0] = left[1] + right[1] + root.val;

        //not take root
        res[1] = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);

        return res;
    }
}