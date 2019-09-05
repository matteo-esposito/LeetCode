# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):    
    def getleafs(self, node, leafs):
        if node:
            self.getleafs(node.left, leafs)
            if not node.left and not node.right:
                leafs.append(node.val)
            self.getleafs(node.right, leafs)
        return leafs

    def leafSimilar(self, root1, root2):
        """
        :type root1: TreeNode
        :type root2: TreeNode
        :rtype: bool
        """
        return self.getleafs(root1, []) == self.getleafs(root2, [])