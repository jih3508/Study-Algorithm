import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**5)

def dfs(node, value):
    for item in tree[node]:
        if distance[item[0]] == -1:
            distance[item[0]] = value + item[1]
            dfs(item[0], value + item[1])

N = int(input())
tree = {i : [] for i in range(1, N + 1)}
for _ in range(N - 1):
    a, b, weight = map(int, input().split())
    tree[a].append((b, weight))
    tree[b].append((a, weight))
    
distance = [-1] * (N + 1)
distance[1] = 0
dfs(1, 0)
start = distance.index(max(distance))
distance = [-1] * (N + 1)
distance[start] = 0
dfs(start, 0)
print(max(distance))