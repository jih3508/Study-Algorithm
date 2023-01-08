import heapq
N, M = map(int, input().split())
books = sorted(list(map(int, input().split())))

left = []
right= []
max_move = 0 # 최대 거리
for book in books:
    if book < 0:
        heapq.heappush(left, book)
    else:
        heapq.heappush(right, -book)
    max_move = max(max_move, abs(book))

move = 0 # 총 이동거리

# 왼쪽, 오른쪽 거리 구하기
for i in range(len(left)):
    num = - heapq.heappop(left)
    if i % M == 0:
        move += num * 2

for i in range(len(right)):
    num = - heapq.heappop(right)
    if i % M == 0:
        move += num * 2

print(move - max_move)