N = int(input())
dp = [0] * 11
dp[2] = 1

for i in range(3, N + 1):
    B = i // 2 + (i % 2)
    C = i // 2
    dp[i] = B * C + dp[B] + dp[C]

print(dp[N])