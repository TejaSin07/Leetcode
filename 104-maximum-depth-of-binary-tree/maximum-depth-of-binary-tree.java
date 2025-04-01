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
    public int maxDepth(TreeNode root) {
        int max = 0;
        
        if(root == null) return 0;
       
        
           max = Math.max(maxDepth(root.left),max);
        
            max = Math.max(maxDepth(root.right),max);
        

        return max +1;

    }
}