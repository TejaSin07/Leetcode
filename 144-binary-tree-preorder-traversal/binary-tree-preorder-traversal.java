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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lst = new LinkedList<>();
        helper(lst,root);
        return lst;
    }

    public void helper( List<Integer> lst,TreeNode root){
        if(root == null)return;
        lst.add(root.val);
        helper(lst,root.left);
        helper(lst,root.right);
    }
}