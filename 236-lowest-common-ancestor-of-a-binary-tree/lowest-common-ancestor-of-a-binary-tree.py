# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

# class Solution:
#     def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
#         # NOTe that the problem description said that " two given nodes in the tree." So the parameters p and q are node references in the tree.

# #  recursive method for all type of tree
#         if not root or root == p or root == q:
#             return root
 
#         l = self.lowestCommonAncestor(root.left, p, q)
#         r = self.lowestCommonAncestor(root.right, p, q)

#         if l and r:
#             return root
#         return l or r

#     #below solution in only for BST    
#     '''    curr = root
#         while curr:
#             if curr.val >p.val and curr.val >q.val:
#                 curr = curr.left
#             elif curr.val <p.val and curr.val < q.val:
#                 curr = curr.right
#             else:
#                 return curr'''
class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        if not root or root == p or root == q:
            return root

        l =  self.lowestCommonAncestor(root.left,p,q)

        r =  self.lowestCommonAncestor(root.right,p,q)


        if l and r :
            return root

        return l or r 