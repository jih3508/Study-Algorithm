import sys
input = sys.stdin.readline

n = int(input())
INF = 1e7
adj = [[INF] * (n + 1) for _ in range(n + 1)]
for _ in range(int(input())):
    a, b, c= map(int, input().split())
    adj[a][b] = min(adj[a][b], c)

for k in range(1, n + 1):
    for i in range(1, n + 1):
        for j in range(1, n + 1):
            if(i != j):
                adj[i][j] = min(adj[i][j], adj[i][k] + adj[k][j])
            else: adj[i][j] = 0

for i in adj[1:]:
    for j in i[1:]:
        print((j, 0)[j == INF], end= ' ')
    print()