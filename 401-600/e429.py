# Definition for a Node.
class Node(object):
    def __init__(self, val, children):
        self.val = val
        self.children = children

class Solution(object):
    def levelOrder(self, root):
        """
        :type root: Node
        :rtype: List[List[int]]
        """
        return bfs(root)

    def bfs(root):
        out = []
        
        if root:
            out = [root.val] 
        
        if root:
            temp = []
            for chlid in root.children:
                temp.append(child)

            out.append(temp)

            for chlid in root.children:
                bfs(child)
        
        return out
            
            

