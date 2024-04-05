class Solution:
    def numDecodings(self, s):
        if s[0] == '0': return 0

        length = len(s)
        dp = [0] * (length + 1)
        dp[0], dp[1] = 1, 1

        for i in range(2, length + 1):
            nowNum = int(s[i-2: i])

            if(s[i-1] != '0'):
                dp[i] += dp[i-1]

            if(10 <= nowNum <= 26):
                dp[i] += dp[i-2]

        return dp[length]


solution = Solution()

print(solution.numDecodings("12"))
print(solution.numDecodings("226"))
print(solution.numDecodings("06"))
print(solution.numDecodings("10"))