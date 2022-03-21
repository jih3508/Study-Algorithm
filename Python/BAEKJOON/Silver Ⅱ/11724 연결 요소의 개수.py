import sys

input = sys.stdin.readline

N, M = map(int, input().split())
grape = { i : [] for i in range(1, N + 1)}
for _ in range(M):
    x, y = map(int, input().split())
    grape[x].append(y)
    grape[y].append(x)

visited = [True for _ in range(N+1)]
stack = [1]
count = 1
while sum(visited) > 1:
    if stack:
        node = stack.pop()
        if visited[node]:
            visited[node] = False
            stack.extend(grape[node])
    else:
        count += 1
        stack.append(visited[1:].index(True) + 1)

print(count)