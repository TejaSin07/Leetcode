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
        List<Integer> lst = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        TreeNode cur = root;
        TreeNode last = null;
        while(!stk.isEmpty() || cur != null){

            if(cur != null){
                stk.push(cur);
                cur = cur.left;
            }
            else{
                TreeNode pk = stk.peek();
                if(pk.right != null && pk.right != last){
                    cur = pk.right;
                }
                else{
                    lst.add(pk.val);
                    last = stk.pop();
                }
            }
        }
        return lst;
    }
}