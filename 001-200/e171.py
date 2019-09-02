class Solution(object):
    def titleToNumber(self, s):
        """
        :type s: str
        :rtype: int
        """
        
        # Create dictionary of capital alphabet letters
        d = {chr(i+64):i for i in range(1,27)}
        
        res = 0
        for c in s:
            res += d[c]
        
        for i in range(len(res)-1):
            res += 26*res[i]

        return res

