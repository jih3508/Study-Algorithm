import heapq

N, M = map(int, input().split())
presents = []
for present in list(map(int, input().split())):
    heapq.heappush(presents, -present)
children = list(map(int, input().split()))
flag = 1
for child in children:
    present = -heapq.heappop(presents)
    if child > present:
        flag = 0 
        break
    heapq.heappush(presents, child - present)
        
print(flag)