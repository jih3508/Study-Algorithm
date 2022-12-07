import heapq, sys
input = sys.stdin.readline

lheap = [] # 작은 숫자 힙
rheap = [] # 큰 숫자 힙

for _ in range(int(input())):
    num = int(input())
    heapq.heappush(lheap, (-num, num))
    
    # 길이가 안맞을때 왼쪽 힙 큰 값을 오르쪽 힙에 추가한다.
    if len(lheap) - 1> len(rheap):
        heapq.heappush(rheap, heapq.heappop(lheap)[1])
    
    # 왼쪽 힙과 오른쪽 힙이 안맞을때 맞추는 작업
    if rheap and lheap[0][1] > rheap[0]:
        heapq.heappush(rheap, heapq.heappop(lheap)[1])
        num = heapq.heappop(rheap)
        heapq.heappush(lheap, (-num, num))
    
    print(lheap[0][1])