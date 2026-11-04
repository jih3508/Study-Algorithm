from pkgutil import resolve_name
from typing import List
from collections import deque


class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:

        # 상하좌우 4방향만 연결로 인정 — 대각선은 다른 섬
        DX = [-1, 1, 0, 0]
        DY = [0, 0, -1, 1]
        m, n = len(grid), len(grid[0])

        """
            (x, y)에서 시작해 연결된 땅을 모두 물('0')로 바꿔 방문 처리한다.
            @param x 시작 행
            @param y 시작 열
        """
        def dfs(x, y):
            # 방문 표시는 꺼낼 때가 아니라 넣을 때 — 같은 칸의 중복 삽입 방지
            queue = deque([[x, y]])
            grid[x][y] = "0"

            while queue:
                now_location = queue.popleft()

                for i in range(4):
                    fx, fy = now_location[0] + DX[i], now_location[1] + DY[i]

                    # 범위 검사를 먼저 해야 grid 접근에서 인덱스 예외가 안 남
                    if 0 <= fx < m and 0 <= fy < n and grid[fx][fy] == "1":
                        grid[fx][fy] = "0"
                        queue.append([fx, fy])

        """
        격자에서 4방향으로 이어진 '1' 덩어리(섬)의 개수를 센다.
        @param grid '1'(땅)과 '0'(물) 격자. 방문한 땅을 '0'으로 바꾼다.
        """
        count = 0
        for x in range(m):
            for y in range(n):
                # 남은 '1'은 아직 어떤 섬에도 안 들어간 땅 — 새 섬의 시작점
                if grid[x][y] == "1":
                    dfs(x, y)
                    count += 1

        return count

solution = Solution()
print(solution.numIslands([
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]))

print(solution.numIslands([
    ["1", "1", "0", "0", "0"],
    ["1", "1", "0", "0", "0"],
    ["0", "0", "1", "0", "0"],
    ["0", "0", "0", "1", "1"]
]))