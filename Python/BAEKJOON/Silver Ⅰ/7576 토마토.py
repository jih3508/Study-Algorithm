import sys
from collections import deque

input = sys.stdin.readline

M, N = map(int, input().split())
matrix = [list(map(int, input().split())) for _ in range(N)]
dx = [-1, 0, 0, 1]
dy = [0, 1, -1, 0]
count = 1

queue = deque([])

for i in range(N):
    for j in range(M):
        if matrix[i][j] == 1:
            queue.append((i, j))
        
data = [queue.copy(), []]
while queue:
    nx, ny = queue.popleft()
    for i in range(4):
        fx, fy = dx[i] + nx, dy[i] + ny
        if (0 <= fx < N and 0 <= fy < M) and (matrix[fx][fy] == 0):
            queue.append((fx, fy))
            matrix[fx][fy] = 1
            data[count].append((fx, fy))
    if data[count-1][-1][0] == nx and data[count-1][-1][1] == ny:
        count += 1
        data.append([])
    
print(-1 if str(matrix).count('0') else len(data) - 3)