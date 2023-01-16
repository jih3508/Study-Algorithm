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


N, M , X = map(int, input().split())    
grape = {i: [] for i in range(1, N + 1)}

for _ in range(M):
    a, b, T = map(int, input().split())
    grape[a].append([b, T])

max_distance = 0
for i in range(1, N + 1):
    max_distance = max(dijkstra(X, i) + dijkstra(i, X), max_distance)

print(max_distance)