# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeElements(self, head, val):
        """
        :type head: ListNode
        :type val: int
        :rtype: ListNode
        """
        tempval = head
        while tempval:
            if head.val == val:
                head = head.next
                head.next = head.next.next
            head = head.next
            tempval = head.next
        return head