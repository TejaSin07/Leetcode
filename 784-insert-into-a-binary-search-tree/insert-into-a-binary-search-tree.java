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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode cur = root;
        TreeNode newNode = new TreeNode(val);

        while(cur !=null){

            if(cur.val > val){
                if(cur.left == null){
                    cur.left = newNode;
                    return root;
                }
                cur = cur.left;
            }
            else{
                if(cur.right == null){
                    cur.right = newNode;
                    return root;
                }
                cur = cur.right;
            }
        }
        return newNode;
    }
}