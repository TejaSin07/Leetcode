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
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        
        if(root == null) return result;

        stack1.add(root);

        while(!stack1.isEmpty()){
            
            TreeNode nod = stack1.pop();
            
            stack2.add(nod);

            if(nod.left != null)stack1.push(nod.left);
            
            if(nod.right != null)stack1.push(nod.right);


        } 

        while(!stack2.isEmpty()){
            TreeNode nod = stack2.pop();
            result.add(nod.val);
        }
        return result;
    }
}