import sys
from collections import deque

input = sys.stdin.readline

def bfs(start, num):
    nodes = [0 for _ in range(N+1)]
    visited = [True for _ in range(N+1)]
    queue = deque()
    queue.append(i)
    while queue:
        node = queue.popleft()
        for j in grape[node]:
            if visited[j] and j != i:
                nodes[j] = nodes[node] + 1
                queue.append(j)
                visited[j] = False
    return sum(nodes)

N, M = map(int, input().split())

grape = {i : [] for i in range(1, N + 1)}
meeting = [0 for _ in range(N + 1)]

for _ in range(M):
    x, y = map(int, input().split())
    grape[x].append(y)
    grape[y].append(x)

q = deque()

meeting[0] = N * N
for i in range(1, N+1):
    meeting[i] = bfs(i, N)

print(meeting.index(min(meeting[1:])))