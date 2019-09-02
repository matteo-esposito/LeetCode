class Solution(object):
    def findDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        dic ={}
        lis=[]
        for i,val in enumerate(nums):
            if val in dic:
                lis.append(val)
            else:
                dic[val]=i
        return lis
            
