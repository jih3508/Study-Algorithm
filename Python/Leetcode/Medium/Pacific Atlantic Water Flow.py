from typing import List
from collections import deque

class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        rows = len(heights)
        cols = len(heights[0])
        location = [(1, 0), (-1, 0), (0, 1), (0, -1)]  # 좌우 방향 방향

        def bfs(row: int, col: int) -> bool:
            visited = [[False] * cols for _ in range(rows)] # 방문 여부
            queue = deque([(row, col)])
            visited[row][col] = True
            up, down, left, right = row == 0, row == (rows - 1), col == 0, col == (cols - 1)

            while queue:
                x, y = queue.popleft()
                for dx, dy in location:
                    fx, fy = x + dx, y + dy
                    # 조건
                    # 1. fx, fy가 범위 안에 있을 경우
                    # 2. fx,fy 위치가 방문 안 했을 경우
                    # 3. fx,fy 위치가 기존 높이 보다 작을 경우 또는 이전 위치와 현재 위치가 높이 같을 경우
                    if (0 <= fx < rows) and (0 <= fy < cols)  and (not visited[fx][fy]) and  (heights[x][y] >= heights[fx][fy]):
                        queue.append((fx, fy))
                        visited[fx][fy] = True
                        if fx == 0:
                            up = True

                        if fx == (rows - 1):
                            down = True

                        if fy == 0:
                            left = True

                        if fy == (cols - 1):
                            right = True

                if  ((up and right)
                    or (up and down)
                    or (left and right)
                    or (left and down)):
                    return True


            # 되는 조건
            # 맨 위, 맨 오른쪽 방문 한 경우
            # 맨 위, 맨 아래 방문 한 경우
            # 맨 왼쪽, 맨 오른쪽 방문 한 경우
            # 맨 왼쪽, 맨 아래쪽 방문 한 경우

            return False


        result = []
        for i in range(rows):
            for j in range(cols):
                if bfs(i, j):
                    result.append([i, j])

        return result

solution = Solution()
heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
print(solution.pacificAtlantic(heights)) # [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
heights = [[1]]
#print(solution.pacificAtlantic(heights))

