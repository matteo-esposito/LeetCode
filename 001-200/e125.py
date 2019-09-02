import re
class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s = re.sub("[^a-zA-Z0-9]", "", s) # alphanumeric filter.
        return str(s).lower() == str(s).lower()[::-1]

        