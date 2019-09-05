# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def inorderTraversal(self, root):
        if not root:
            return []
        return (self.inorderTraversal(root.left) + [root.val] + self.inorderTraversal(root.right))

    def isValidBST(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        # Perform inorder traversal and check that it is monotonically increasing.
        tree = self.inorderTraversal(root)
        for i in range(len(tree)-1):
            if tree[i] >= tree[i+1]:
                return False
        return True