from collections import deque


def count_area(high):
    # bfs 탐색
    def bfs(x, y):
        dx = [-1, 1, 0, 0]
        dy = [0, 0, -1, 1]
        queue = deque([(x, y)])
        board[x][y] = 0
        while queue:
            nx, ny = queue.popleft()
            for k in range(4):
                fx, fy = nx + dx[k], ny + dy[k]
                if 0 <= fx < N and 0 <= fy < N and board[fx][fy] == 1:
                    board[fx][fy] = 0
                    queue.append((fx, fy))

    # 잠긴 영역은 0 안 잠긴 영역 1로 표기
    board = []
    for i in range(N):
        array = []
        for j in range(N):
            array.append(1 if areas[i][j] > high else 0)
        board.append(array)

    cnt = 0
    for i in range(N):
        for j in range(N):
            # 안 잠긴 영역있을 경우 영역 조사
            if board[i][j] == 1:
                bfs(i, j)
                cnt += 1 # 영역 조사후 지역 카운터 늘리기
    return cnt


N = int(input())

areas = [list(map(int, input().split())) for _ in range(N)]

min_high = min(min(areas, key=lambda area: min(area)))  # 가장 작은 높이
max_high = max(max(areas, key=lambda area: max(area)))  # 가장 큰 높이

count = 0

for high in range(min_high - 1, max_high + 1):
    # 높이가 H일때 영역 개수 비교 해서 가장 많은 개수 구하기
    count = max(count, count_area(high))

print(count)