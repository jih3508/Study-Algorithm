'''
- 데드라인을 초과하는 문제는 풀 수 없다.
- 데이터의 개수(N)는 최대 200,000이다.
- 정렬 및 우선순위 큐를 이용하여 O(NlogN)의 시간에 해결 할 수 있다.
- 가장 먼저, 문제 데이터 중에서 데드라인을 기준으로 오름차순 정렬을 수행한다.
- 각 문제의 '컵라면 수'를 우선순위 큐에 넣으면서, 데드라인을 초과하는 경우에는 최소 원소를 제거한다.
'''

import heapq

n = int(input())
array = []
q = []

# 문제 정보를 입력 받은 이후에, 데드라인을 기준으로 정렬
for i in range(n):
    a, b = map(int, input().split(' '))
    array.append((a, b))
array.sort()

for i in array:
    a = i[0]
    heapq.heappush(q, i[1])
    #데드라인을 초과하는 경우에는 최소 원소를 제거
    if a < len(q):
        heapq.heappop(q)

print(sum(q))