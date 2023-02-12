'''
- 최대 K개의 집중국을 설치 해야한다.
- 집중국들의 수신 가능 영역의 길이의 합을 최소화하는 것이다.
- 사실상 정렬만 수행하면 되므로 O(NlogN)으로 문제를 해결할 수 있다.
- 각 센서들을 위치를 기준으로 오름차순 정렬을 수행한다.
- 문제의 요구사항은 정렬된 센서들을 최대 K개의 영역으로 나누는 것과 동일하다.
- 알고리즘
    - 각 센서를 오름차순 정렬한다.
    - 각 센서 사이의 거리를 계산한다.
    - 가장 거리가 먼 순서대로 K - 1개의 연결 고리를 제거한다.
'''
import sys

n = int(input())
k = int(input())

# 집중국의 개수가 n 이상일 때
if k >= n:
    print(0)
    sys.exit()

# 모든 센서의 위치를 입결 받아 오름차순 정렬
array = list(map(int, input().split(' ')))
array.sort()

#각 센서 간의 거리를 계산하여 내림차순 정렬
distances = []
for i in range(1, n):
    distances.append(array[i] - array[i - 1])
distances.sort(reverse=True)

# 가장 긴 거리부터 하나씩 제거
for i in range(k - 1):
    distances[i] = 0
print(sum(distances))