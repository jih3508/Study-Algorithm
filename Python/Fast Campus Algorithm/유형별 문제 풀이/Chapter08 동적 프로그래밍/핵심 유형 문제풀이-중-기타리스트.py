'''
- 차례대로 곡을 연주한다는 점에서, 동적 프로그래밍으로 해결할 수 있는 문제
- 곡의 개수가 N, 볼륨의 최댓값은 M이다.
- 동적 프로그래밍을 이용하여 시간 복잡도 O(NM)으로 문제를 해결
- 핵심아이디어: 모든 볼륨에 대하여 연주 가능 여부를 계산하기
- D[i][j + 1] =i 번째 노래일 때 j 크기의 볼륨으로 연주 가능한지 여부
- 노래를 순서대로 확인하며, 매 번 모든 크기의 볼륨에 대하여 검사
- D[i][j - V[i]] = True (if D[i-1][j] = True)
- D[i][j + V[i]] = True (if D[i-1][j] = True)
'''
n, s, m = map(int, input().split())
array = list(map(int, input().split()))

dp = [[0] * (m+1) for _ in range(n+1)]
dp[0][s] = 1

for i in range(1, n + 1):
    for j in range(m + 1):
        if dp[i-1][j] == 0:
            continue
        if j - array[i - 1] >= 0: 
            dp[i][j - array[i - 1]] = 1
        if j + array[i - 1] <= m:
            dp[i][j + array[i - 1]] = 1

result = -1
for i in range(m, -1, -1):
    if dp[n][i]== 1:
        result = i
        break
    
print(result)