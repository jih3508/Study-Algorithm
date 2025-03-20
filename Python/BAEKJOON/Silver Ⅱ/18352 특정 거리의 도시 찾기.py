from collections import deque
import sys
input = sys.stdin.readline

def bfs(start):
    queue = deque([start])
    while queue:
        now = queue.popleft()
        for node in graph[now]:
            if(distance[node] == 0 and start != node):
                distance[node] = distance[now] + 1
                queue.append(node)

N, M, K, X = map(int, input().split())
distance = [0] * (N + 1)
graph = {i : [] for i in range(1, N + 1)}

for _ in range(M):
    x, y = map(int, input().split())
    graph[x].append(y)


bfs(X)
result = []
for i in range(1, N + 1):
    if(distance[i] == K):
        result.append(i)

if result:
    print("\n".join(map(str, result)))
else:
    print("-1")