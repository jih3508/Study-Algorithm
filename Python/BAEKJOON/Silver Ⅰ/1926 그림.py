import sys
from collections import deque
input = sys.stdin.readline

# 상하좌우 방향
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

# 그림 탐색
def bfs(x, y):
    queue = deque([(x, y)])
    picture[x][y] = 0
    count = 1
    while queue:
        nx, ny = queue.popleft()
        for k in range(4):
            fx, fy = nx + dx[k], ny + dy[k]
            # 그림 영역이 포함 되어 있는지 확인
            if 0 <= fx < n and 0 <= fy < m and picture[fx][fy] == 1:
                # 그림 역역있으면 영역을 지우고 면적개수 +1 증가한다.
                picture[fx][fy] = 0
                count += 1
                queue.append((fx, fy))

    counter.append(count)

n, m = map(int, input().split())
picture = [list(map(int, input().split())) for _ in range(n)]
counter = [0] # 없는 경우 0을 출력 해야 하기 때문에 0을 추가한다.

# 그림 전체 탐
for i in range(n):
    for j in range(m):
        if picture[i][j] == 1:
            bfs(i, j)

print(len(counter) - 1)
print(max(counter))