'''
- 두 수열이 주어졌을 때, 두 수열 모두의 부분 수열이 되는 수열 중 가장 긴 것을 찾아야 한다.
- 가장 긴 공통 부분 수열(LCS)문제로 알려진 대표적인 동적 프로그래밍 문제
- 두 수열의 길이가 N 미만일 때, 시간 복잡도O(N^2)으로 문제를 해결
- 두 수열을 각각 X, Y라고 한다.
- D[i][j] = X[0...i]와 Y[0...j]의 공통 부분 수열의 최대 길이
- 두 문자열의 길이를 조금씩 늘려 가며 확인하여, 공통 부분 수열의 최대 길이를 계산
- D[i][j] = D[i-1][j-1] + 1 (if X[i] = Y[i])
          = max(D[i][j-1], D[i-1][j]) (if X[i] ≠ Y[j])
'''

x = input()
y = input()

dp = [[0] * (len(y) + 1) for _ in range(len(x) + 1)]

for i in range(1, len(x) + 1):
    for j in range(1, len(y) + 1):
        if x[i-1] == y[j-1]:
            dp[i][j] = dp[i-1][j-1] + 1
        else:
            dp[i][j] = max(dp[i][j-1], dp[i-1][j])

print(dp[len(x)][len(y)])