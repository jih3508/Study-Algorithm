class Solution:
    def knightDialer(self, n: int) -> int:
        # 이동 가능한 지점
        movePoints = {
            0: [4, 6],
            1: [6, 8],
            2: [7, 9],
            3: [4, 8],
            4: [3, 9, 0],
            5: [],
            6: [1, 7, 0],
            7: [2, 6],
            8: [1, 3],
            9: [2, 4]
        }
        MOD = int(1e9 + 7) # 나머지 연산 수

        dp = [[0] * 10 for _ in range(n)]
        dp[0] = [1] * 10
        for i in range(n-1):
            # 0 ~ 9까지 탐색
            for j in range(10):
                # 이동할 지점에 추가
                for point in movePoints[j]:
                    dp[i+1][point] = (dp[i+1][point] + dp[i][j]) % MOD

        # 결과 0 ~ 9까지 경우의 수 더하기
        return sum(dp[n-1]) % MOD

solution = Solution()
print(solution.knightDialer(1))
print(solution.knightDialer(2))
print(solution.knightDialer(3131))