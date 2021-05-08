# 선택 정렬 알고리즘으로 문제 해결하기
n = int(input())
array = list()

for _ in range(n):
    array.append(int(input()))
    
for i in range(n):
    min_index = i # 가장 작은 원소의 인덱스
    for j in range(i + 1, n):
        if array[min_index] > array[j]:
            min_index = j
    array[i], array[min_index] = array[min_index], array[i] # 스와프

for i in array:
    print(i)