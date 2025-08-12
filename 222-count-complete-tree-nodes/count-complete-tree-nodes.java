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
    public int countNodes(TreeNode root) {
        if(root == null)return 0;

        int left = countLeft(root.left);
        int right = countRight(root.right);

        if(left == right) return (2<<left)-1;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }


    private int countLeft(TreeNode root){
        if(root == null)return 0;
        int count = 0;
        while(root != null){
            count++;
            root = root.left;
        }
        return count;
    }
    private int countRight(TreeNode root){
        if(root == null)return 0;
        int count = 0;
        while(root != null){
            count++;
            root = root.right;
        }
        return count;
    }
}