import sys, heapq
input = sys.stdin.readline
INF = 1e9

def dijkstra(start, end):
    distances = [INF] * (N + 1)
    distances[start] = 0
    queue = [(0, start)]

    while queue:
        now_distance, now_node = heapq.heappop(queue)
        if now_distance > distances[now_node]: continue
        for node, weight in grape[now_node]:
            distance = now_distance + weight

            if distances[node] > distance:
                distances[node] = distance
                heapq.heappush(queue, (distance, node))

    return distances[end]


N, M = map(int, input().split())    
grape = {i: [] for i in range(1, N + 1)}


for _ in range(M):
    a, b, T = map(int, input().split())
    grape[a].append([b, T])
    grape[b].append([a, T])


v1, v2 = map(int, input().split())

result = min(dijkstra(1, v1) + dijkstra(v1, v2) + dijkstra(v2, N), dijkstra(1, v2) + dijkstra(v2, v1) + dijkstra(v1, N))

print(result if result < INF else -1)