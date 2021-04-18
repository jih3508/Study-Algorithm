#1. 카드 중 3개씩 뽑는 모든 경우의 수는 C(n, 3)이면, N은 최대 100입니다.
#2. 따라서 단순히 3중 반복문으로 모든 경우의 수를 확인하여 문제를 해결할 수 있습니다.

n, m = list(map(int, input().split(' ')))
data = list(map(int, input().split(' ')))

result = 0
length = len(data)

count = 0
for i in range(0, length):
    for j in range(i + 1, length):
        for k in range(j + 1, length):
            sum_value = data[i] + data[j] + data[k]
            if sum_value <= m:
                result = max(result, sum_value)
                
print(result)