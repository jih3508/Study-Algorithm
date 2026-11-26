from collections import deque

# 상하좌우 4방향 (행 변화량, 열 변화량). 호출마다 새로 만들 필요가 없는 상수다.
DIRECTIONS = ((1, 0), (-1, 0), (0, -1), (0, 1))


class Solution:
    def floodFill(self, image: list[list[int]], sr: int, sc: int, color: int) -> list[list[int]]:
        """(sr, sc)와 같은 색으로 상하좌우 연결된 영역을 BFS로 color로 칠한다.

        image: 픽셀 격자 (직접 수정해서 반환한다)
        sr, sc: 시작 행, 시작 열
        color: 새로 칠할 색
        """
        # 칠하면서 image 값이 바뀌므로 비교 기준인 원래 색을 먼저 저장해 둔다
        original_color = image[sr][sc]
        # 이미 목표 색이면 바꿀 게 없다. 이 가드가 있어야
        # "색이 바뀐 칸 = 방문한 칸"이 성립해 visited 배열 없이 돈다.
        if original_color == color:
            return image

        m, n = len(image), len(image[0])

        # list.pop(0)은 O(n)이라 큐로 쓰면 느리다. deque.popleft()는 O(1).
        queue = deque([(sr, sc)])
        image[sr][sc] = color

        while queue:
            x, y = queue.popleft()
            for dx, dy in DIRECTIONS:
                fx, fy = x + dx, y + dy
                if 0 <= fx < m and 0 <= fy < n and image[fx][fy] == original_color:
                    # 넣을 때 바로 칠해서 방문 표시를 겸한다. 중복 삽입을 막는다.
                    image[fx][fy] = color
                    queue.append((fx, fy))

        return image


solution = Solution()
print(solution.floodFill([[1, 1, 1], [1, 1, 0], [1, 0, 1]] , 1, 1, 2))
print(solution.floodFill([[0, 0, 0], [0, 0, 0]] , 0, 0, 0))
print(solution.floodFill([[0, 0, 0], [0, 0, 0]] , 1, 0, 2))