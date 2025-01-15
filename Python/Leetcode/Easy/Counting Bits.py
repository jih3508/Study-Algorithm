from typing import List

class Solution:
    def countBits(self, n: int) -> List[int]:

        dp = [0 for i in range(n + 1)]
        n2 = 1
        for i in range(1, n + 1):
            if n2 == i:
                n2 *= 2
                dp[i] = 1
            else:
                dp[i] = dp[i - n2 // 2] + 1

        return dp


solution = Solution()
print(solution.countBits(2))
print(solution.countBits(5))