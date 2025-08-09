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
    public int amountOfTime(TreeNode root, int start) {
        HashMap<Integer,Set<Integer>> adjMap = new HashMap<>();

        createAdjList(root,0,adjMap);
        Set<Integer> visited  = new HashSet<>();
        Queue<Integer> infeQue = new LinkedList<>();
        int minutes = 0;
        int curQSize = 0;

        infeQue.add(start);
        visited.add(start);

        while(!infeQue.isEmpty()){
            curQSize = infeQue.size();
            while(curQSize > 0){

                int curNode = infeQue.poll();

                for(int curNeighbor : adjMap.get(curNode)){
                    if(!visited.contains(curNeighbor)){
                        infeQue.add(curNeighbor);
                        visited.add(curNeighbor);
                    }
                }
                curQSize--;
            }
            minutes++;

        }
        return minutes-1;
    }

    private static void createAdjList(TreeNode root,int parent, HashMap<Integer,Set<Integer>> adjMap){

        if(root == null)return ;

        if(!adjMap.containsKey(root.val)){
            adjMap.put(root.val,new HashSet<>());
        }

        Set<Integer> curSet = adjMap.get(root.val);
        if(parent != 0){
            curSet.add(parent);
        }

        if(root.left != null){
            curSet.add(root.left.val);
        }
        if(root.right != null){
            curSet.add(root.right.val);
        }

        createAdjList(root.left,root.val,adjMap);
        createAdjList(root.right,root.val,adjMap);
    }
}