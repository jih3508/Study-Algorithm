from typing import List
from collections import deque

class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        rows = len(heights)
        cols = len(heights[0])

        def bfs(row: int, col: int) -> bool:
            location = [(1, 0), (-1, 0), (0, 1), (0, -1)]
            visited = [[False] * cols for _ in range(rows)]
            height = heights[row][col]
            queue = deque([(row, col)])
            visited[row][col] = True

            while queue:
                x, y = queue.popleft()
                for dx, dy in location:
                    fx, fy = x + dx, y + dy
                    if ((0 <= fx < rows) and (0 <= fy < cols)
                            and (fx == row or fy == col)
                            and (not visited[fx][fx])
                            and (height >= heights[fx][fy])):
                        queue.append((fx, fy))
                        visited[fx][fy] = True
                print(queue)
                for visit in visited:
                    print(visit)

            # 되는 조건
            # 맨 위, 맨 오른쪽 방문 한 경우
            # 맨 위, 맨 아래 방문 한 경우
            # 맨 왼쪽, 맨 오른쪽 방문 한 경우
            # 맨 왼쪽, 맨 아래쪽 방문 한 경우
            return ((visited[0][col] and visited[row][cols - 1])
                    or (visited[0][col] and visited[rows - 1][col])
                    or (visited[row][0] and visited[row][cols -1])
                    or (visited[row][0] and visited[rows - 1][col]))





        result = []
        bfs(0,4)
        #
        # for i in range(rows):
        #     for j in range(1):
        #         print(i, j)
        #         if bfs(i, j):
        #             result.append([i, j])

        return result

solution = Solution()
heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
print(solution.pacificAtlantic(heights))
heights = [[1]]
#print(solution.pacificAtlantic(heights))

