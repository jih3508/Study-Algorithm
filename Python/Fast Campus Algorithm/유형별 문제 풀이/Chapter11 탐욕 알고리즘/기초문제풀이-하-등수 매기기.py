'''
- 예상된 등수와 실제 등수의 차이를 최소화해야 합니다.
- 이를 위해서, 예상된 등수를 오름차순으로 정렬하면된다.
'''
n = int(input())
array = []
for _ in range(n):
    array.append(int(input()))

# 오름차순 정렬 수행
array.sort()

# 불만도의 합 계산
result = 0
for i in range(1, len(array) + 1):
    result += abs(i - array[i - 1])

print(result)