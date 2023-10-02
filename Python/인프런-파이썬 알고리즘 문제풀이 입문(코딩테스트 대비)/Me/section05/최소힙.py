import sys
import heapq
sys.stdin=open("./Me/section05/input.txt", "r")

heap = []
while True:
    num = int(input())
    if num == -1:
        break  
    elif num == 0:
        print(-heapq.heappop(heap))
    else:
        heapq.heappush(heap, -num)