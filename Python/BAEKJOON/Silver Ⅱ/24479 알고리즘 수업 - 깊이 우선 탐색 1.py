import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**9)

def dfs(n):
    global count
    visited[n] = count
    count += 1
    for node in grape[n]:
        if visited[node] == 0:
            dfs(node)

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
dfs(start)
print('\n'.join(map(str, visited[1:])))