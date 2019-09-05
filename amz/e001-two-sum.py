
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        d = {}
        sol = []
        j = 0
        for i in range(len(nums)):
            desired = target - nums[i]
            if desired in nums and nums.index(desired) != i:
                sol.append(i)
                sol.append(nums.index(desired))
                break
        return sol
