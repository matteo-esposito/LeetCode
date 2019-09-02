# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        vals = []
        if not head:
            return True # empty ll
        
        while head:
            vals.append(head.val)
            head = head.next

        return vals == vals[::-1]