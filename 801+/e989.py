class Solution(object):
    def addToArrayForm(self, A, K):
        """
        :type A: List[int]
        :type K: int
        :rtype: List[int]
        """
        val = ""
        for i in A:
            val += str(i)
        
        sol = int(val) + K
        res = []
        for i in str(sol):
            res += i

        return res