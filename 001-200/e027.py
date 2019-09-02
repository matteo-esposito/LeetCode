class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        counter = 0
        for i in nums:
            if i == val:
                counter += 1
        
        for i in range(counter):
            nums.remove(val)

        return len(nums)
        