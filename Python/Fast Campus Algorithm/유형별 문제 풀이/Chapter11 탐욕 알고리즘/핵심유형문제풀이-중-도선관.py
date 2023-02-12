'''
- 일직선상의 각 책들을 원래의 위치에 놓아야 한다.
- 0보다 큰 책들과 0보다 작은 책들을 나누어서 처리한다.
- 두 개의 우선순위 큐를 이용하여 문제를 효과적으로 해결 할 수 있다.
- 마지막 책을 놓을 때는 다시 0으로 돌아올 필요가 없으므로, 가장 먼 책을 마지막으로 놓는다.
- 책의 개수(N) = 7, 한 번에 들 수 있는 책의 개수(M) = 2
- 음수와 양수에 대하여 개별적으로, M개씩 묶어서 처리한다.
- M개씩의 묶음 중에서 가장 거리가 먼 책만큼 이동해야 한다.
'''
import heapq
n, m = map(int, input().split(' '))
array = list(map(int, input().split(' ')))
positive = []
negative = []

# 가장 거리가 먼 책까지의 거리
largest = max(max(array), -min(array))

# 최대 힙(Max Heap)을 위해 원소를 음수로 구성
for i in array:
    # 책의 위치가 양수인 경우
    if i > 0:
        heapq.heappush(positive, -i)
    # 책의 위치가 음수인 경우
    else:
        heapq.heappush(negative, i)

result = 0

while positive:
    # 한 번에 m개씩 옮길 수 있으므로 m개씩 빼내기
    result += heapq.heappop(positive)
    for _ in range(m - 1):
        if positive:
            heapq.heappop(positive)

while negative:
    # 한 번에 m개씩 옮길 수 있으므로 m개씩 빼내기
    result += heapq.heappop(negative)
    for _ in range(m - 1):
        if negative:
            heapq.heappop(negative)

# 일반적으로 왕복 거리를 계산하지만, 가장 먼 곳을 편도 거리 계산
print(-result * 2 - largest)