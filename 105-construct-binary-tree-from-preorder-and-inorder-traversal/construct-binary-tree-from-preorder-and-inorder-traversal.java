class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inorderIndexMap = new HashMap<>(); // Map to store value → index in inorder array
        for (int i = 0; i < inorder.length; i++) { 
            inorderIndexMap.put(inorder[i], i); // Store each value’s index for quick lookup
        }

        return build(preorder, 0, preorder.length - 1, // Full preorder range
                     inorder, 0, inorder.length - 1,   // Full inorder range
                     inorderIndexMap); // Pass index map
    }

    private TreeNode build(int[] preorder, int preStart, int preEnd, // Preorder boundaries
                           int[] inorder, int inStart, int inEnd,    // Inorder boundaries
                           Map<Integer, Integer> inorderIndexMap) {  // Map for quick lookup

        if (preStart > preEnd || inStart > inEnd) return null; // Base case: no elements to construct

        TreeNode root = new TreeNode(preorder[preStart]); // First preorder element is the root

        int inRootIndex = inorderIndexMap.get(root.val); // Index of root in inorder array
        int numsLeft = inRootIndex - inStart; // Number of nodes in left subtree

        root.left = build(preorder, preStart + 1, preStart + numsLeft, // Left subtree in preorder
                          inorder, inStart, inRootIndex - 1,           // Left subtree in inorder
                          inorderIndexMap); // Recurse for left subtree

        root.right = build(preorder, preStart + numsLeft + 1, preEnd,  // Right subtree in preorder
                           inorder, inRootIndex + 1, inEnd,            // Right subtree in inorder
                           inorderIndexMap); // Recurse for right subtree

        return root; // Return constructed root
    }
}
