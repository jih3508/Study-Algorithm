import sys
from collections import deque
input = sys.stdin.readline
INF = 1000 * 1000 # 최대값

def bfs():
    dx = [0, 1, 0, -1]
    dy = [1, 0, -1, 0]
    field = [[[INF, INF] for _ in range(M)]for _ in range(N)]
    field[0][0][0] = 1
       
    queue = deque([(0, 0, 0)])
    while queue:
        x, y, flag = queue.popleft() # x, y는 좌표 flag는 이전에 벽을 뚫었는지
        for i in range(4):
            fx, fy = x + dx[i], y + dy[i]
            if 0 <= fx < N and 0 <= fy < M:
                # 일반적인 경우
                if matrix[fx][fy] == 0 and field[fx][fy][flag] == INF:
                    field[fx][fy][flag] = field[x][y][flag] + 1
                    queue.append((fx, fy, flag))
                # 벽이 있는데 이전에 벽을 안뚫었을 경우
                elif matrix[fx][fy] == 1 and flag == 0:
                    field[fx][fy][1] = field[x][y][flag] + 1
                    queue.append((fx, fy, 1))
    result = min(field[N-1][M-1])
    return -1 if result == INF else result

N, M = map(int, input().split())
matrix = []
for _ in range(N):
    array = []
    for i in input()[:-1]:
        array.append(int(i))
    matrix.append(array)

print(bfs())