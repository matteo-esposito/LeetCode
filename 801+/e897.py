# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def increasingBST(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        visited = []
        def inorder(node):
            if node:
                inorder(node.left)
                visited.append(node.val)
                inorder(node.right)
        
        inorder(root)
        newtree = TreeNode(visited[0])
        sol = newtree
        for e in visited[1:]:
            sol.right = TreeNode(e)
            sol = sol.right

        return newtree


                
