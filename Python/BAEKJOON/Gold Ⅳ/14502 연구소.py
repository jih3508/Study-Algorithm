import sys, copy
from collections import deque
from itertools import combinations
input = sys.stdin.readline

dx = [0, 0, 1, -1]
dy = [1, -1, 0 ,0]

# 벽 세우기
def set_wall():
    count = 0
    for walls in combinations(cleans, 3):
        for x, y in walls:
            fields[x][y] = 1
        count = max(dfs(), count)
        for x, y in walls:
            fields[x][y] = 0
    return count


def dfs():
    # 연구도 지도와 viruse위치 가져 올때 깊은 복사로 처리 해야 한다. 값을 참조하기 때문에 dfs연산후 리스트에 반영 될수 있기 때문이다.
    matrix = copy.deepcopy(fields)
    queue = deque(copy.deepcopy(viruses))
    while queue:
        x, y = queue.popleft()
        # 바이러스 상하좌우로 퍼트리기
        for i in range(4):
            fx, fy = x + dx[i], y + dy[i]
            if 0<= fx <N and 0 <= fy < M and matrix[fx][fy] == 0:
                queue.append((fx, fy))
                matrix[fx][fy] = 2
    no_virus_count = 0
    #print("matrix")
    for array in matrix:
        #print(array)
        no_virus_count += array.count(0)
    return no_virus_count


N, M = map(int, input().split())
fields = [list(map(int, input().split())) for _ in range(N)]
viruses = []
cleans = []

# 바이러스 위치 찾기
for i in range(N):
    for j in range(M):
        if(fields[i][j] == 2):
            viruses.append((i, j))
        elif(fields[i][j] == 0):
            cleans.append((i, j))

print(set_wall())