class Solution(object):
    def findWords(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        rows = ['qwertyuiop','asdfghjkl','zxcvbnm']
        line = 0
        out = []
        for w in words:
            if w.lower()[0] in rows[0]:
                line = 0
            elif w.lower()[0] in rows[1]:
                line = 1
            else:
                line = 2

            for char in w.lower():
                same_row = True
                if char not in rows[line]:
                    same_row = False
                    break

            if same_row:
                out.append(w)

        return out