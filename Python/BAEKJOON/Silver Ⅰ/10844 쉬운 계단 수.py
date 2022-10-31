n = int(input())

dp = [[1] * (10) for _ in range(n + 1)]
dp[0][0], dp[1][0] = 0, 0

MOD = 1000000000

for i in range(2, n + 1):
    dp[i][0] = dp[i - 1][1]
    for j in range(1, 9):
        dp[i][j] = (dp[i-1][j-1] + dp[i-1][j + 1]) % MOD
    dp[i][9] = dp[i - 1][8]

print(sum(dp[n]) % MOD)