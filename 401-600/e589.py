# Definition for a Node.
class Node(object):
    def __init__(self, val, children):
        self.val = val
        self.children = children

class Solution(object):
    def preorder(self, root):
        """
        :type root: Node
        :rtype: List[int]
        """

        if not root:
            return visited

        visited = []
        stack = [root]

        while stack:
            current = stack.pop(0)
            if current:
                visited.append(current.val)
                stack = current.children + stack
        return visited