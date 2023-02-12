import sys
import heapq
input = sys.stdin.readline

N = int(input())

array = []
for _ in range(N):
    array.append(list(map(int, input().split())))

array.sort()
heap = []
for count, number in array:
    heapq.heappush(heap, number)
    if count < len(heap):
        heapq.heappop(heap)

print(sum(heap))