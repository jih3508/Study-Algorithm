import sys
import heapq
from collections import deque

input = sys.stdin.readline
INF = float('inf')

def dijkstra(start, end):
    distances = [INF] * (N + 1)
    distances[start] = 0
    queue = [(start, 0)]
    while queue:
        now_node, now_distance = heapq.heappop(queue)
        if now_distance > distances[now_node]: continue

        for node, weight in grape[now_node]:
            distance = now_distance + weight
            if distance < distances[node]:
                distances[node] = distance
                heapq.heappush(queue, (node, distance))
    return distances[end]
        

N = int(input())
grape = {i:[] for i in range(1, N + 1)}
for _ in range(int(input())):
    a, b , value = map(int, input().split())
    grape[a].append((b, value))

start, end = map(int, input().split())
print(dijkstra(start, end))