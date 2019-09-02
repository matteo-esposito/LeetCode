class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        d = {}
        for char in s:
            if char not in d:
                d[char] = 1
            else:
                d[char] += 1

        for char in t:
            if char in d:
                d[char] -= 1
                if d[char] < 0:
                    return False
            else:
                return False
        
        return sum(d.values()) == 0
        
        
