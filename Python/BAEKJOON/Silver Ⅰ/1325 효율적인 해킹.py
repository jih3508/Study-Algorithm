import sys
input = sys.stdin.readline

N, M = map(int, input().split())

adj = [[] for _ in range(N + 1)]
for _ in range(M):
    x, y = map(int, input().split())
    adj[y].append(x)

count = [0] * (N + 1)

for i in range(1, N +1):
    visited = [False] * (N + 1)
    stack = [i]
    while stack:
        node = stack.pop()
        if not visited[node]:
            stack.extend(adj[node])
            visited[node] = True
    count[i] = sum(visited)

max_value = max(count)
for i in range(1, N + 1):
    if count[i] == max_value: print(i, end=' ')