from collections import deque
import sys

input = sys.stdin.readline

# 시작 위치 찾기
def findStartLocation():
    for i in range(n):
        for j in range(m):
            if boards[i][j] == 2:
                return (i, j)

def notFindLoad(arrays):
    for i in range(n):
        for j in range(m):
            if (boards[i][j] == 1 and arrays[i][j] == 0):
                arrays[i][j] = -1

    return arrays

def bfs():
    dx = [0, 0, -1, 1]
    dy = [-1, 1, 0, 0]

    queue = deque()
    queue.append(findStartLocation())

    distances = [[0] * m for _ in range(n)]

    while queue:
        x, y = queue.popleft()

        for k in range(4):
            fx, fy = x + dx[k], y + dy[k]
            if (0 <= fx < n and 0 <= fy < m) and (boards[fx][fy] != 2 and boards[fx][fy] == 1 and distances[fx][fy] == 0):
                distances[fx][fy] = distances[x][y] + 1
                queue.append((fx, fy))

    return notFindLoad(distances)


n, m = map(int, input().split())
boards = [list(map(int, input().split())) for _ in range(n)]

for array in bfs():
    print(' '.join(map(str, array)))