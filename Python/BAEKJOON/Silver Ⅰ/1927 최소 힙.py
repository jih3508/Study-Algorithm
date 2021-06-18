import sys
from collections import deque
import heapq
input = sys.stdin.readline

heap = [] 
for _ in range(int(input())):
    x = int(input())
    if x == 0:
        if heap: 
            print(heapq.heappop(heap))
        else: print(0)
    else:
        heapq.heappush(heap, x)