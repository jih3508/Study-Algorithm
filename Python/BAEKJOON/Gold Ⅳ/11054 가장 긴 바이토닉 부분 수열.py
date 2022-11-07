def LIS(S, N, num):
    dp = [num] * N
    for i in range(N):
        for j in range(i):
            if S[i] > S[j]:
                dp[i] = max(dp[i], dp[j] + 1)
    return dp

N = int(input())
S =  list(map(int, input().split()))

dp_l = LIS(S, N, 1)
S.reverse()
dp_r = LIS(S, N, 0)
dp = []
dp_r.reverse()
for i in range(N):
    dp.append(dp_l[i] + dp_r[i])

print(max(dp))