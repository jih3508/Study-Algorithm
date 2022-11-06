'''
- 다익스트라 최단 경로 알고리즘을 수행한다.
- 다익스트라 최단 경로에 포함되는 모든 간선을 추적해야 한다.,
- 초기 최단 경로에 포함된 간선을 제외한 뒤에, 다시 최단 경로를 탐색하면된다.
'''

from collections import deque
import heapq
import sys
input = sys.stdin.readline

INF = sys.maxsize

def dijkstra():
    heap_data = []
    heapq.heappush(heap_data, (0, start))
    distance[start] = 0
    while heap_data:
        dist, now = heapq.heappop(heap_data)
        if distance[now] < dist:
            continue
        for i in adj[now]:
            cost = dist + i[1]
            if distance[i[0]] > cost and not dropped[now][i[0]]:
                distance[i[0]] = cost
                heapq.heappush(heap_data, (cost, i[00]))

def bfs():
    q = deque()
    q.append(end)
    while q:
        now = q.popleft()
        if now == start:
            continue
        for prev, cost in reverse_adj[now]:
            if distance[now] == distance[prev] + cost:
                dropped[prev][now] = True
                q.append(prev)

while True:
    n, m = map(int, input().split())
    if n == 0:
        break
    start, end = map(int, input().split())
    adj = [[] for _ in range(n+1)]
    reverse_adj = [[] for _ in range(n + 1)]
    for _ in range(m):
        x, y, cost = map(int, input().split())
        adj[x].append((y, cost))
        reverse_adj[y].append((x, cost))
    dropped = [[False] * (n + 1) for _ in range(n + 1)]
    distance = [INF] * (n + 1)
    dijkstra()
    bfs()
    distance = [INF] * (n + 1)
    dijkstra()
    if distance[end] != INF:
        print(distance[end])
    else:
        print(-1)