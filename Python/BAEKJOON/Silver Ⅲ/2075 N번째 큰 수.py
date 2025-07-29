import sys, heapq
input = sys.stdin.readline

# N×N 표의 크기 입력받기
N = int(input())

# 첫 번째 행을 읽어서 최소 힙 초기화
# 이 힙은 항상 N개의 가장 큰 수들을 유지함
heap = list(map(int, input().split()))

# 두 번째 행부터 N번째 행까지 처리
for _ in range(N - 1):
    # 각 행의 수들을 하나씩 처리
    for num in map(int, input().split()):
        # 새로운 수를 힙에 추가
        heapq.heappush(heap, num)
        # 힙에서 가장 작은 수를 제거 (힙 크기를 N으로 유지)
        # 이렇게 하면 힙에는 항상 현재까지 본 수들 중 가장 큰 N개가 남음
        heapq.heappop(heap)

# 힙의 루트(가장 작은 값)가 N번째로 큰 수
print(heap[0])