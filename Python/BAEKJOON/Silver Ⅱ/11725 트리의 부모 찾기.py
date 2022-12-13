import sys
from collections import deque
input = sys.stdin.readline

def level_order(start):
    queue = deque([start])
    while queue:
        node = queue.popleft()
        for i in tree[node]:
            if parent[i] == 0:
                parent[i] = node
                queue.append(i)
    
N = int(input())
tree = {i : [] for i in range(1, N + 1)}

parent = [0] * (N + 1)

for _ in range(N - 1):
    a ,b = map(int, input().split())
    tree[a].append(b)
    tree[b].append(a)
level_order(1)

for node in parent[2:]:
    print(node)