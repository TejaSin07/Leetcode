# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> int:
        if not root:
            return 0

        def count_path_sum(node,target):
            if not node:
                return 0
            count = 0
            if node.val == target:
                count+=1

            count += count_path_sum(node.left,target-node.val) 

            count += count_path_sum(node.right,target-node.val)

            return count
        def traverse(node):
            if not node:
                return 0
            count_node_sum = count_path_sum(node,targetSum)

            lef_sum = traverse(node.left)
            rig_sum = traverse(node.right)

            return count_node_sum + lef_sum + rig_sum

        return traverse(root) 






        # if not root:
        #     return 0 

        # def count_path(node,target):
        #     if not node:
        #         return 0
        #     count = 0 
        #     if node.val == target :
        #         count +=1
        #     count += count_path(node.left,target-node.val) 
        #     count += count_path(node.right,target-node.val) 

        #     return count

        # def traverse(node):
        #     if not node:
        #         return 0 
        #     path_from_node = count_path(node,targetSum)

        #     path_from_left = traverse(node.left)

        #     path_from_right = traverse(node.right)

        #     return path_from_node + path_from_left + path_from_right
        # return traverse(root)            

        