# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def isUnivalTree(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        # perform dfs and check if all entries in visited list are equal or null. (recursive since simpler)
        visited = []
        def dfs(vertex):
            if vertex:
                visited.append(vertex.val)
                dfs(vertex.left)
                dfs(vertex.right)

        dfs(root)
        return len(set(visited)) == 1


        