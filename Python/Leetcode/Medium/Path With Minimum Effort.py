from collections import deque

class Solution:
    def minimumEffortPath(self, heights) -> int:
        def bfs(gap):
            # 방향
            dx = [1, -1, 0, 0]
            dy = [0, 0, 1, -1]

            # 방문 여부를 담기 위한 집합 포함 여부 할때 set으로 처리하는게 속도가 더 빠름
            paths = set([(0, 0)])
            queue = deque([(0, 0)])

            while(queue):
                nx, ny = queue.popleft()
                if (nx, ny) == (self.x - 1, self.y - 1):
                    return True

                for k in range(4):
                    fx, fy = nx + dx[k], ny + dy[k]
                    if 0 <= fx < self.x and 0 <= fy < self.y and (fx, fy) not in paths and abs(self.heights[nx][ny] - self.heights[fx][fy]) <= gap:
                        queue.append((fx, fy))
                        paths.add((fx, fy))

            #print(gap, paths)
            return False

        self.heights = heights
        self.x = len(self.heights)
        self.y = len(self.heights[0])


        right = max(max(heights, key=lambda height: max(height)))
        left = 0

        while left < right:
            mid = (left + right) // 2

            # mid 안에 끝까지 갈수 있을 경우 큰 값을 줄인다.
            if bfs(mid):
                right = mid
            else:
                left = mid + 1

        return right






solution = Solution()
print(solution.minimumEffortPath([[1,2,2],[3,8,2],[5,3,5]]))
print(solution.minimumEffortPath([[1,2,3],[3,8,4],[5,3,5]]))
print(solution.minimumEffortPath([[1,2,1,1,1],[1,2,1,2,1],[1,2,1,2,1],[1,2,1,2,1],[1,1,1,2,1]]))
print(solution.minimumEffortPath([[1,10,6,7,9,10,4,9]]))
print(solution.minimumEffortPath([[3]]))
print(solution.minimumEffortPath([[4,3,4,10,5,5,9,2],[10,8,2,10,9,7,5,6],[5,8,10,10,10,7,4,2],[5,1,3,1,1,3,1,9],[6,4,10,6,10,9,4,6]]))