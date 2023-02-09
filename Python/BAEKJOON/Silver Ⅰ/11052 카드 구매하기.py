N = int(input())
pack = list(map(int, input().split()))
dp = [0] * N
for i in range(N):
    dp[i] = pack[i]
    for j in range(i):
        dp[i] = max(dp[i], dp[i - j - 1] + pack[j])

print(dp[N - 1])