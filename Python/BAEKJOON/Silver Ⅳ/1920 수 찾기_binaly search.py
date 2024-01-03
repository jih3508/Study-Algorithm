N = int(input())
A = list(map(int, input().split()))
A.sort() # 이분탐색을 위한 정렬
M = int(input())
array = list(map(int, input().split()))

for num in array:
    # 시작점, 끝점, 배열안 존재 여부 초기화
    start, end = 0, N - 1
    isInNum = 0
    # 이분 탐색
    while start <= end:
        mid = (start + end) // 2 # 중간값 계산
        if A[mid] == num:
            isInNum = 1
            break
        elif A[mid] < num:
            start = mid + 1
        else:
            end = mid - 1
    print(isInNum)