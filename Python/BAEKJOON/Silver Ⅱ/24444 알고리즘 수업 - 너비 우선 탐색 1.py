import sys
from collections import deque
input = sys.stdin.readline

def bfs(start_node):
    global count
    visited[start_node] = count
    count += 1
    queue = deque([start_node])
    while queue:
        node = queue.popleft()
        for n in grape[node]:
            if visited[n] == 0:
                visited[n] = count
                count += 1
                queue.append(n)

N, M, start = map(int, input().split())
grape = {i : [] for i in range(1, N + 1)}

for _ in range(M):
    a, b = map(int, input().split())
    grape[a].append(b)
    grape[b].append(a)

visited = [0] * (N + 1)

for i in range(1, N + 1):
    grape[i].sort()

count = 1
bfs(start)
print('\n'.join(map(str, visited[1:])))