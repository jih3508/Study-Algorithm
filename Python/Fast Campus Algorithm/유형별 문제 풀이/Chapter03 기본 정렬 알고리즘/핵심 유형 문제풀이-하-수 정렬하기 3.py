'''
1. 데이터의 개수가 최대 10,000,000개 입니다.
2. 시간 복잡도 O(N)의 정렬 알고리즘을 이용해야 한다.
3. 수의 범위가 1~10,000이므로 계수 정렬을 이용할 수 있다.

계수 정렬(Counting Sort) 알고리즘
- 배열의 인덱스를 특정한 데이터의 값으로 여기는 정렬 방법입니다.
- 배열의 크기는 데이터의 범위를 포함할 수 있도록 설정한다.
- 데이터가 등장한 횟수를 센다.
'''
import sys

n = int(sys.stdin.readline())
array = [0] * 10001

for i in range(n):
    data = int(sys.stdin.readline())
    array[data] +=1

for i in range(10001):
    if array[i] != 0:
        for j in range(array[i]):
            print(i)