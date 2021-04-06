#이진 탐색 소스코드
def binary_search(data, start, end, target):
    while start <= end:
        mid = (start + end) // 2
        # 찾은 경우 중간점 인덱스 반환
        if data[mid] == target:
            return mid
        #중간점의 값보다 큰 경우 오른쪽 확인
        elif data[mid] <target:
            start = mid + 1
        #중간점의 값보다 작은 경우 왼쪽 확인
        else:
            end = mid -1
    return None

#리스트 [1, 3, 5, 7, 9]에서 값이 7인 원소 탐색하기
data = [1, 3, 5, 7, 9]
result = binary_search(data, 0 , len(data)-1, 7)

if result == None:
    print("탐색 실패")
else:
    print("탐색 성공: 인데스", result)