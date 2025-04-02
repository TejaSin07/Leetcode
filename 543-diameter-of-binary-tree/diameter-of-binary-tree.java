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
    int maxd = 0;
    int count = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if(root== null) return 0;
        count++;

        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);

        count--;

        maxd = Math.max(maxd,left+right);

        return count==0 ?maxd:Math.max(left,right)+1;
    }
}