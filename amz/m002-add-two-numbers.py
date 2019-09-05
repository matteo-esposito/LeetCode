
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
        # take vals and put into list
        # find sum
        num1 = []
        num2 = []
        while l1:
            num1.append(l1.val)
            l1 = l1.next
        while l2:
            num2.append(l2.val)
            l2 = l2.next

        num1.reverse()
        num2.reverse()

        val1 = ""
        val2 = ""
        for n in num1:
            val1 += str(n)
        for n in num2:
            val2 += str(n)
        
        sol = str(int(val1) + int(val2))
        
        # TODO

        return tree
