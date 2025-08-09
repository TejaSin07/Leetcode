class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // Map value → index for inorder traversal (for O(1) lookups)
        Map<Integer, Integer> inorderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        return build(inorder, 0, inorder.length - 1,
                     postorder, 0, postorder.length - 1,
                     inorderIndexMap);
    }

    private TreeNode build(int[] inorder, int inStart, int inEnd,
                           int[] postorder, int postStart, int postEnd,
                           Map<Integer, Integer> inorderIndexMap) {

        if (inStart > inEnd || postStart > postEnd) return null; // No nodes left

        // Last element in postorder is the root
        TreeNode root = new TreeNode(postorder[postEnd]);

        // Find root in inorder array
        int inRootIndex = inorderIndexMap.get(root.val);
        int numsLeft = inRootIndex - inStart; // Number of nodes in left subtree

        // Build left and right subtrees
        root.left = build(inorder, inStart, inRootIndex - 1,
                          postorder, postStart, postStart + numsLeft - 1,
                          inorderIndexMap);

        root.right = build(inorder, inRootIndex + 1, inEnd,
                           postorder, postStart + numsLeft, postEnd - 1,
                           inorderIndexMap);

        return root;
    }
}
