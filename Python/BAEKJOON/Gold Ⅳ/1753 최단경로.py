import heapq, sys
from collections import defaultdict

input = sys.stdin.readline
INF = float('inf')

def dijkstra(grape, start):
    distances[start] = 0
    queue = []
    heapq.heappush(queue, (distances[start], start))
    
    while queue:
        current_distance, current_node = heapq.heappop(queue)
        
        if current_distance > distances[current_node]: continue
        
        for node, weight in grape[current_node]:
            distance = current_distance + weight
            
            if distance < distances[node]:
                distances[node] = distance
                heapq.heappush(queue, (distance, node))
                   
V, E = map(int, input().split())
grape = {i : [] for i in range(1, V + 1)}
start = int(input())
distances = {i: INF for i in range(1, V + 1)}

for _ in range(E):
    u, v, w = map(int, input().split())
    grape[u].append((v, w))
    
dijkstra(grape, start)
for i in range(1, V + 1):
    print("INF" if distances[i] == INF else distances[i])