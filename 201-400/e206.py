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
        prev = None
        curr = head
        while curr:
            next = curr.next    # store next node pointer
            curr.next = prev    # move next pointer to prvious node
            prev = curr         # move previous pointer to current
            curr = next         # move current pointer to right

        return prev