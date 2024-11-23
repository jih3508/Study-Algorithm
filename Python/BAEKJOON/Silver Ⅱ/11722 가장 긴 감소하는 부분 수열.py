N = int(input())
A = list(map(int, input().split()))

# 모든 dp 배열 1로 초기화
dp = [1] * N

for i in range(1, N):
    for j in range(i):
        if(A[i] < A[j]):
            # 이전 값들과 비교해서 큰 값이면 이전 저장 되는 것과 수열 개수 비교
            dp[i] = max(dp[i], dp[j] + 1)

# dp 배열중 가장 길게 저장 된 결과 값을 가져온다.
print(max(dp))