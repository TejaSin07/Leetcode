class Solution {
    int maxDistance = 0;
    public int amountOfTime(TreeNode root, int start) {
        dfs(root, start);
        return maxDistance;
    }

    private int dfs(TreeNode root, int start) {
        int depth = 0;
        if(root == null) return depth;

        int leftMax = dfs(root.left, start);
        int rightMax = dfs(root.right, start);

        if(root.val == start) {
            maxDistance = Math.max(leftMax, rightMax);
            depth = -1;
        } else if(leftMax >= 0 && rightMax >= 0) {
            depth = Math.max(leftMax, rightMax) + 1;
        } else {
            int distance = Math.abs(leftMax) + Math.abs(rightMax);
            maxDistance = Math.max(maxDistance, distance);
            depth = Math.min(leftMax, rightMax) - 1;
        }
        return depth;
    }
}