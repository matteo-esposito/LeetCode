class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        roman = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}

        sum = 0

        for i in range(len(s)):
            if i != len(s) - 1:
                if s[i] == 'I' and s[i+1] in ['V', 'X']:
                    sum -= 1
                elif s[i] == 'X' and s[i+1] in ['L', 'C']:
                    sum -= 10
                elif s[i] == 'C' and s[i+1] in ['D', 'M']:
                    sum -= 100
                else:
                    sum += roman[s[i]]
            else:
                sum += roman[s[i]]

        return sum        