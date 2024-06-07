class Solution:
    def leafSimilar(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> bool:
        def getrootnode(root):
            if not root:
                return []
            stack = [root]
            leaves = []
            while stack:
                node = stack.pop()
                if not node.right and not node.left:
                    leaves.append(node.val)
                if node.right:
                    stack.append(node.right)
                if node.left:
                    stack.append(node.left)

            return leaves
        return getrootnode(root1) == getrootnode(root2)
                

