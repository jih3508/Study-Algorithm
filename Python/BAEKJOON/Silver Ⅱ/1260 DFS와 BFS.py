import sys
from collections import deque
input = sys.stdin.readline

def dfs(node):
    visited = [True for _ in range(n+1)]
    stack = [node]
    array = []
    while stack:
        item = stack.pop()
        if visited[item]:
            array.append(item)
            visited[item] = False
            stack.extend(data[item][::-1])
    return array
        
def bfs(node):
    visited = [True for _ in range(n+1)]
    queue = deque([node])
    array = []
    while queue:
        item = queue.popleft()
        if visited[item]:
            visited[item] = False
            array.append(item)
            queue.extend(data[item])
    return array
    

n, m, v = map(int, input().split())
data = {i: [] for i in range(1, n+1)}
for _ in range(m):
    x, y = map(int, input().split())
    data[x].append(y)
    data[y].append(x)
    
for i in range(1, n+1):
    data[i].sort()
    
print(' '.join(map(str, dfs(v))))
print(' '.join(map(str, bfs(v))))