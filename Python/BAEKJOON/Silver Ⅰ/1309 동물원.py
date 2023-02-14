N = int(input())

dp = [3, 7]
for i in range(2, N):
    dp.append((dp[i - 1] * 2 + dp[i - 2]) % 9901)

print(dp[N - 1])