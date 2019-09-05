class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        sol, res = 0, 0
        temp = abs(x)
            
        while True:
            res = temp % 10
            temp = temp // 10
            sol = sol*10 + res
            if temp == 0:
                break
        
        sol = sol if x > 0 else -sol
        if sol < -2 ** 31 or sol > 2 ** 31 - 1:
            return 0
        else:
            return sol