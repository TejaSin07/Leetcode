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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if(root == null){
            return result;
        }
        que.add(root);
        int count =0;
        while(!que.isEmpty()){
            int level = que.size();
            List<Integer> arr = new ArrayList<>();
            for(int i = 0;i< level;i++){
                if(que.peek().left != null){
                    que.add(que.peek().left);
                }
                if(que.peek().right != null){
                    que.add(que.peek().right);
                }
                arr.add(que.peek().val);
                que.remove(que.peek());
            }
            count++;
            if(count%2 == 0)Collections.reverse(arr);
            result.add(arr);
        }
        return result; 
    }
}