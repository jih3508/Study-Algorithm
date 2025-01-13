N = int(input())
# 피보나치 초기값 설정
dp = [0 for _ in range(N + 2)]
dp[1] = 1

# 2번째부터 N번째 피보나치 수 계산
for i in range(2, N + 1):
    dp[i] = dp[i - 1] + dp[i - 2]

print(dp[N])