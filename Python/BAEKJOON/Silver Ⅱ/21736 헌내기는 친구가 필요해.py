import sys
from collections import deque

input = sys.stdin.readline

# 도연 위치 찾기
def findLocation():
    for i in range(N):
        for j in range(M):
            if campus[i][j] == 'I':
                return (i, j)

def bfs():
    dx = [0, 0, -1, 1]
    dy = [-1, 1, 0, 0]

    x, y = findLocation()
    
    # 도연 위치는 탐색 안하는 곳으로 설정 한다.
    campus[x][y] = 'X'

    queue = deque()
    queue.append((x, y))

    count = 0
    
    while queue:
        x, y = queue.popleft()
        
        for k in range(4):
            fx, fy = x + dx[k], y + dy[k]
            if (0 <= fx < N and 0 <= fy < M) and campus[fx][fy] != 'X':
                # 사람일 경우
                if campus[fx][fy] == 'P':
                    count += 1
                campus[fx][fy] = 'X'
                queue.append((fx, fy))

    return count

N, M = map(int, input().split())

campus = [list(input())  for _ in range(N)]

count = bfs()

print("TT" if count == 0 else count)
