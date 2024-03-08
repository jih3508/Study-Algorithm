class Solution:
    def integerBreak(self, n: int) -> int:
        dp = [0] * (n + 1)
        dp[1] = 1
        for i in range(2, n + 1):
            for j in range(1, i // 2 + 1):
                dp[i] = max(dp[i], dp[j] * dp[i - j], j * (i - j))

        return dp[n]

solution = Solution()

print(solution.integerBreak(2))
print(solution.integerBreak(10))


