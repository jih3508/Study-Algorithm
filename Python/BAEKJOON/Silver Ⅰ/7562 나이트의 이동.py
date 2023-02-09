import sys
from collections import deque
input = sys.stdin.readline

# 나이트 이동할수 있는 좌표
dx = [-2, -2, -1, -1, 1, 1, 2, 2] 
dy = [-1, 1, -2, 2, -2, 2, -1, 1]

def dfs(n):
    fields = [[0] * n for i in range(n)]
    queue = deque([start])
    while queue:
        x, y = queue.popleft()
        if end == [x, y]:
            break
        for i in range(8):
            fx, fy = x + dx[i], y + dy[i]
            if 0<= fx < n and 0 <= fy < n and fields[fx][fy] == 0:
                fields[fx][fy] = fields[x][y] + 1
                queue.append((fx, fy))
    return fields[end[0]][end[1]]

for _ in range(int(input())):
    size = int(input())
    start = list(map(int, input().split()))
    end = list(map(int, input().split()))
    print(dfs(size))