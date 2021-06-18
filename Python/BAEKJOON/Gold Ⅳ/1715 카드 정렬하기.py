import sys
import heapq
input = sys.stdin.readline

heap = []
count = 0
for _ in range(int(input())):
    heapq.heappush(heap, int(input()))

while len(heap) != 1:
    a = heapq.heappop(heap) 
    b = heapq.heappop(heap)
    count += a + b
    heapq.heappush(heap, a + b)

print(count)