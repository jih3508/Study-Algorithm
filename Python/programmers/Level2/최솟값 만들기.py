import heapq

def solution(A,B):
    answer = 0
    lenth = len(A) # A, B 리스트 길이

    # A, B 힙구조로 변경
    heapq.heapify(A)
    heapB = []
    # B는 MaxHeap으로 -1 곱해서 저장한다.
    for num in B:
        heapq.heappush(heapB, -1 * num)

    for _ in range(lenth):
        # B는 MaxHeap 구조라서 꺼낸후 -1 곱해야 기존 값이 된다.
        answer += heapq.heappop(A) * -1 * heapq.heappop(heapB)

    return answer


print(solution([1, 4, 2], [5, 4, 4]))
print(solution([1, 2], [3, 4]))