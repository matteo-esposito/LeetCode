class Solution(object):
    def uncommonFromSentences(self, A, B):
        """
        :type A: str
        :type B: str
        :rtype: List[str]
        """
        adic = {}
        bdic = {}
        out = []
        
        for word in A.split(" "):
            if word not in adic:
                adic[word] = 1
            else:
                adic[word] += 1
        
        for word in B.split(" "):
            if word not in bdic:
                bdic[word] = 1
            else:
                bdic[word] += 1
                
        for akey in adic.keys():
            for bkey in bdic.keys():
                if adic[akey] == 1 and akey not in bdic:
                    out.append(akey)
                
                if bdic[bkey] == 1 and bkey not in adic:
                    out.append(bkey)

        return list(set(out))