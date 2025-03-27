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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> Inor = new LinkedList<Integer>();
        helper(Inor,root);
        return Inor;
    }

    public void helper(List<Integer> Inor,TreeNode root){
        if(root == null)return ;
        
        helper(Inor,root.left);
        Inor.add(root.val);
        helper(Inor,root.right);

    }
}