class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        d = {}
        for n in nums:
            if d.__contains__(n):
                d.pop(n)
            else:
                d[n] = 1
        return d.keys()