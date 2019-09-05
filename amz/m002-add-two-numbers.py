
# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        dummy_ret = ListNode(0)
        mod = dummy_ret
        carry = 0

        while l1 or l2 or carry != 0:
            current_total = carry
            if l1:
                current_total += l1.val
                l1 = l1.next
            if l2:
                current_total += l2.val
                l2 = l2.next
            mod.next = ListNode(current_total % 10) # Start by modifying the 'next' node from the head since we want to return the dummy linkedlist.next which is where all of our modifications are being 'appended' to.
            carry = current_total // 10
            mod = mod.next
        
        return dummy_ret.next