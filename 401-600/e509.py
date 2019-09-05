class Solution(object):
    def fib(self, N):
        """
        :type N: int
        :rtype: int
        """
        if N == 0:
            return 0
        
        if N in [1, 2]:
            return 1

        a = 0
        b = 1
        for i in range(N):
            a, b = b, a+b
        
        return a
            
