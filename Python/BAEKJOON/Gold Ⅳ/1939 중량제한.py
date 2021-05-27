from collections import deque

def dfs(value):
    visited = [False] * (n+1)
    queue = deque([start_node])
    while queue:
        now_node = queue.popleft()
        for node, weight in adj[now_node]:
            if visited[node] == False and value <= weight:
                if node == end_node: return True
                visited[node] = True
                queue.append(node)
    return visited[end_node]
    

n, m = map(int, input().split())
adj = [[] for _ in range(n+1)]
start= 100001
end = 1
for _ in range(m):
    a, b, c = map(int, input().split())
    adj[a].append((b, c))
    adj[b].append((a, c))
    if start > c: start = c
    if end < c: end = c
start_node , end_node = map(int, input().split())

while start <= end:
    mid = (start + end) //2
    if dfs(mid): start = mid + 1
    else: end = mid - 1
print(end)