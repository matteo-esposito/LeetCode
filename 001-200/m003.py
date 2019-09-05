class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        
        if s == "":
            return 0
        
        if len(re.sub("[ ]", "", s)) == 0:
            return 1

        # Implement the sliding window with 2 pointers.
        a_pointer = 0
        b_pointer = 1
        maxlen = 0
        d = {}
        while b_pointer < len(s):
            d[s[a_pointer]] = 1
            if s[b_pointer] not in d:
                if b_pointer - a_pointer > maxlen:
                    maxlen = b_pointer - a_pointer
                d[s[b_pointer]] = 1
                b_pointer += 1
            else:
                a_pointer += 1
                b_pointer = a_pointer + 1
                d = {}

        return maxlen + 1

