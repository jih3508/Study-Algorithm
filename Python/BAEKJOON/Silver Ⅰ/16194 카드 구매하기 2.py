N = int(input())
p = list(map(int, input().split()))
dp = [0] * N
dp[0] = p[0]

for i in range(1, N):
    dp[i] = p[i]
    for j in range(i):
        dp[i] = min(dp[i], dp[j] + p[i -j - 1])

print(dp[-1])