import sys
sys.stdin=open("./Me/section06/input.txt", "r")

def dfs(node, route):
    global count
    if node == N:
        count += 1
        return
    for item in adj[node]:
        if item not in route:
            dfs(item, route + [item])

N, M = map(int, input().split())
adj = {i : [] for i in range(1, N + 1)}
visited = [0] * (N + 1)
count = 0
for _ in range(M):
    a, b = map(int, input().split())
    adj[a].append(b)

dfs(1, [1])
print(count)