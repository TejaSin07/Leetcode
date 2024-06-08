# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def longestZigZag(self, root: Optional[TreeNode]) -> int:

        if not root:
            return 0
        
        def dfs(node, direction, length):
            nonlocal max_length
            max_length = max(max_length, length)
            
            if direction == 'left':
                if node.left:
                    dfs(node.left, 'right', length + 1)
                if node.right:
                    dfs(node.right, 'left', 1)
            else:  # direction == 'right'
                if node.right:
                    dfs(node.right, 'left', length + 1)
                if node.left:
                    dfs(node.left, 'right', 1)
                    
        max_length = 0
        dfs(root, 'left', 0)
        dfs(root, 'right', 0)
        
        return max_length