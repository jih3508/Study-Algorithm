import heapq

n, m = map(int, input().split())
adj = {}
counter = [0 for _ in range(n + 1)]
for _ in range(m):
    data1, data2 = map(int, input().split())
    counter[data2] += 1
    if data1 in adj:  adj[data1].append(data2)
    else: adj[data1] = [data2]

heap = []
for i in range(1, n+1):
    if counter[i] == 0:  heapq.heappush(heap, i)

result = []
while heap:
    data = heapq.heappop(heap)
    result.append(data)
    if data not in adj: continue
    for node in adj[data]: 
        counter[node] -= 1
        if counter[node] == 0: heapq.heappush(heap, node)

print(" ".join(map(str, result)) )