class Solution:
    def leafSimilar(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> bool:

        def get_leaf_values(root):
            if not root:
                return []
            leaves = []
            stack = [root]

            while stack:
                node = stack.pop()
                if not node.right and not node.left:
                    leaves.append(node.val)
                if node.right:
                    stack.append(node.right)
                if node.left:
                    stack.append(node.left)
            return leaves

        return get_leaf_values(root1)==get_leaf_values(root2)


