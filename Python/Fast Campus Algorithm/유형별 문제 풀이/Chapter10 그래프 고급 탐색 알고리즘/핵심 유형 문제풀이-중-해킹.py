'''
- 기본적인 다익스트라 최단 경로 알고리즘 문제
- 도달할 수 있는 정점들의 개수와 최대 거리를 출력한다.
- 정점의 개수 N이 최대 10,000이고 간선의 개수 D는 최대 100,000이다.
- 우선순위 큐를 이용하여, 시간 복잡도 o(NlogD)로 해결할 수 있다.
'''
import heapq
import sys
input = sys.stdin.readline

def dijkstra(start):
    heap_data = []
    heapq.heappush(heap_data, (0, start))
    distance[start] = 0
    while heap_data:
        dist, now = heapq.heappop(heap_data)
        if distance[now] < dist:
            continue
        for i in adj[now]:
            cost = dist + i[1]
            if distance[i[0]] > cost:
                distance[i[0]] = cost
                heapq.heappush(heap_data, (cost, i[0]))

for _ in range(int(input())):
    n, m, start = map(int, input().split())
    adj = [[] for i in range(n + 1)]
    distance = [1e9] * (n + 1)
    for _ in range(m):
        x, y, cost = map(int, input().split())
        adj[y].append((x, cost))
    dijkstra(start)
    count = 0
    max_distnace = 0
    for i in distance:
        if i != 1e9:
            count += 1
            if i > max_distnace:
                max_distnace = i
    print(count, max_distnace)