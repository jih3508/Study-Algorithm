def solution(m, n, puddles):
    dp = [[0] * (n + 1) for _ in range(m + 1)]

    # 웅덩이 위치 표시
    for (x, y) in puddles:
        dp[x][y] = -1

    dp[1][0] = 1

    for x in range(1, m + 1):
        for y in range(1, n + 1):
            # 웅덩이 없을 경우 위, 왼쪽 더해서 계산
            if(dp[x][y] == 0):
                dp[x][y] = (dp[x - 1][y] + dp[x][y -1]) % 1000000007
            else: # 웅덩이 경우 0으로 초기화 하고 넘김, DP 계산때 편할려고 0으로 초기화 함
                dp[x][y] = 0

    return dp[m][n]


print(solution(4, 3, [[2, 2]]))