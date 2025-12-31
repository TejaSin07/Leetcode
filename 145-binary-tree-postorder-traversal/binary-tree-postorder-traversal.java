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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> lst =  new ArrayList<>();
        if(root == null)return lst;
         helper(root,lst);
         return lst;
    }


    private void helper(TreeNode root,List<Integer>lst){

        if(root.left != null)helper(root.left,lst);
        if(root.right != null )helper(root.right,lst);
        lst.add(root.val);
    }
}