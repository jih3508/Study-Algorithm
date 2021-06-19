'''
- 가장 긴 증가하는 부분 수열(LIS)문제의 변형 문제
- 벽돌의 수가 N개일 때, 시간 복잡도 O(N^2)으로 해결
- 벽돌의 번호를 출력해야 한다는 점에서, 계산된 테이블을 역추적할 수 있다.
- 가장 먼저 벽돌을 무게 기준으로 정렬
- D[i] = 인덱스가 i인 벽돌을 가장 아래에 두었을 때의 최대 높이
- 각 별돌에 대해서 확인하며 D[i]를 갱신
- 모든 0 <= j < i에 대하여, D[i] = max(D[i],D[j] + height[i]) (if area[i] > area[j])
'''
n = int(input())
array = []

array.append((0, 0, 0, 0))
for i in range(1, n+1):
    area, height, weight = map(int, input().split())
    array.append((i, area, height, weight))

# 무게를 기준으로 정렬합니다.
array.sort(key=lambda data: data[3])

dp = [0] * (n + 1)

for i in range(1, n + 1):
    for j in range(0, i):
        if array[i][1] > array[j][1]:
            dp[i] = max(dp[i], dp[j] + array[i][2])

max_value = max(dp)
index = n
result = []

while index != 0:
    if max_value == dp[index]:
        result.append(array[index][0])
        max_value -= array[index][2]
    index -= 1

result.reverse()
print(len(result))
[print(i) for i in result]