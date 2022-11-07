'''
- 2차원 좌표가 주어졌을 때, 모든 좌표를 잇는 최소 신장 트리를 만들어야 한다.
- 따라서 2차원 좌표 상의 점을 잇는 통로들을 고려해야 한다.
- 정점의 개수 N이 최대 1,000이므로, 가능한 통로의 개수는 약 N^2이다.
- 크루스칼 알고리즘은 간선의 개수다 E 일때 O(ElogE)로 동작한다.
- 따라서 이 문제는 크루스칼 알고리즘으로 해결할 수 있다. 
'''

import math
import sys
input = sys.stdin.readline

def get_distance(p1, p2):
    a = p1[0] - p2[0]
    b = p1[1] - p2[1]
    return math.sqrt((a * a) + (b * b))

def get_parent(parent, n):
    if parent[n] == n:
        return n
    return get_parent(parent, parent[n])

def union_parent(parent, a, b):
    a = get_parent(parent, a)
    b = get_parent(parent, b)
    if a < b:
        parent[b] = a
    else:
        parent[a] = b

def find_parent(parent, a, b):
    a = get_parent(parent, a)
    b = get_parent(parent, b)
    if a == b:
        return True
    else:
        return False
    
edges = []
parent = {}
locations = []
n, m = map(int, input().split())

for _ in range(n):
    x, y = map(int, input().split())
    locations.append((x, y))

length = len(locations)

for i in range(length - 1):
    for j in range(i + 1, length):
        edges.append((i + 1, j + 1, get_distance(locations[i], locations[j])))
        
for i in range(1, n + 1):
    parent[i] = i

for i in range(m):
    a, b = map(int, input().split())
    union_parent(parent, a, b)
    
edges.sort(key=lambda data: data[2])

result = 0
for a, b, cost in edges:
    if not find_parent(parent, a, b):
        union_parent(parent, a, b)
        result += cost

print("%0.2f" % result)