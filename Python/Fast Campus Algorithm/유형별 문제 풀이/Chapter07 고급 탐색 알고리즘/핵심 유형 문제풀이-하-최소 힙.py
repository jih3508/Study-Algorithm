'''
- 최소 힙의 기본적인 기능을 구현합니다.
- 파이썬에서 heapq라이브러리를 이용하면 간단히 힙을 구현할 수 있다.
'''
import heapq

n = int(input())
heap = []
result = []

for _ in range(n):
    data = int(input())
    if data == 0:
        if heap:
            result.append(heapq.heappop(heap))
        else:
            result.append(0)
    else:
        heapq.heappush(heap, data)

for data in result:
    print(data)