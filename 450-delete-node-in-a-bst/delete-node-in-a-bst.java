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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)return null;
        if(root.val == key ){
            return helper(root);
        }
        
        TreeNode cur = root;
        while(root != null){

            if(root.val > key){
                if(root.left != null && root.left.val == key){
                    root.left = helper(root.left);
                }
                else{
                    root = root.left;
                }
            }
            else{
                if(root.right != null && root.right.val == key){
                    root.right = helper(root.right);
                }
                else{
                    root = root.right;
                }
            }
        }
        return cur;
    }

    private static TreeNode helper(TreeNode root){
        if(root.left == null){
            return root.right;
        }
        if(root.left == null && root.right == null){
            return null;
        }
        if(root.right == null){
            return root.left;
        }
        if(root.left != null && root.right != null){
            TreeNode temp = root.right;
            TreeNode temp2 = findRight(root.left);

            temp2.right = temp;
            root.right = null;
            return root.left;
        }
        return root;
    }

    private static TreeNode findRight(TreeNode root){
        while(root.right != null){
            root = root.right;
        }
        return root;
    }











}