import sys
from collections import deque
input = sys.stdin.readline
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]


def bfs(x, y):
    queue = deque([(x, y)])
    count = 1
    paper[x][y] = 1
    while queue:
        cx, cy = queue.popleft()
        for i in range(4):
            fx, fy = cx + dx[i], cy + dy[i]
            if(0<= fx < N and 0<= fy < M and paper[fx][fy] == 0):
                paper[fx][fy] = 1
                count += 1
                queue.append((fx, fy))
    return count

M, N, K = map(int, input().split())

paper = [[0] * M for _ in range(N)]

for _ in range(K):
    x1, y1, x2, y2 = map(int, input().split())
    for i in range(x1, x2):
        for j in range(y1, y2):
            paper[i][j] = 1

areas = []
for x in range(N):
    for y in range(M):
        if(paper[x][y] == 0):
            areas.append(bfs(x, y))

areas.sort()
print(len(areas))
print(' '.join(map(str, areas)))