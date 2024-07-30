class Solution:
    def maxIncreaseKeepingSkyline(self, grid: list[list[int]]) -> int:
        witdh = len(grid) # 가로, 세로 길이
        result = 0
        for i in range(witdh):
            for j in range(witdh):
                # 1. gird[i][j]기준으로 각 행 렬 큰 값을 구한다.
                # 2. 각 행, 열 큰 값중 작은 값으로 지정한다.
                # 3. 혹시나 현재 위치 값보다 작을수도 있어서 현재 위치값하고 2번 구한것중 큰값을 지정 하고 gird[i][j] 차이 값을 결과값에 추가 한다.
                result += max(grid[i][j], min(max(grid[i]), max([grid[k][j] for k in range(witdh)]))) - grid[i][j]

        return result

solution = Solution()
print(solution.maxIncreaseKeepingSkyline([[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]))
print(solution.maxIncreaseKeepingSkyline([[0,0,0],[0,0,0],[0,0,0]]))