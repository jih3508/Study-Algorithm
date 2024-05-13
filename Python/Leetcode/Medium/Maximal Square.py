class Solution:
    def maximalSquare(self, matrix: list[list[str]]) -> int:

        # 초기 설정
        # 가로, 세로 높이
        width, height = len(matrix[0]), len(matrix)

        # 최대값
        maxValue = 0

        # dp 초기화
        dp = [[0] * width for _ in range(height)]

        # 각 행렬 0번 째 인덱스 초기화
        for i in range(width):
            dp[0][i] = int(matrix[0][i])
            maxValue = max(maxValue, dp[0][i])

        for i in range(height):
            dp[i][0] = int(matrix[i][0])
            maxValue = max(maxValue, dp[i][0])

        # (1, 1)위치 부터 탐색
        for x in range(1, height):
            for y in range(1, width):
                # 현재 위치가 1일 경우 왼쪽, 위 , 왼쪽 대각선 위 중 최소값을 더하기
                if int(matrix[x][y]):
                    dp[x][y] = min(dp[x-1][y], dp[x][y-1], dp[x- 1][y - 1]) + 1
                    maxValue = max(maxValue, dp[x][y])
                else:
                    dp[x][y] = 0

        return maxValue ** 2


solution = Solution()
print(solution.maximalSquare([["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]))
print(solution.maximalSquare([["0","1"],["1","0"]]))
print(solution.maximalSquare([["0"]]))