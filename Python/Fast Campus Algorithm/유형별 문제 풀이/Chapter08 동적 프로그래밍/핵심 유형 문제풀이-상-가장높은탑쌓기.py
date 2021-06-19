'''
- ���� �� �����ϴ� �κ� ����(LIS)������ ���� ����
- ������ ���� N���� ��, �ð� ���⵵ O(N^2)���� �ذ�
- ������ ��ȣ�� ����ؾ� �Ѵٴ� ������, ���� ���̺��� �������� �� �ִ�.
- ���� ���� ������ ���� �������� ����
- D[i] = �ε����� i�� ������ ���� �Ʒ��� �ξ��� ���� �ִ� ����
- �� ������ ���ؼ� Ȯ���ϸ� D[i]�� ����
- ��� 0 <= j < i�� ���Ͽ�, D[i] = max(D[i],D[j] + height[i]) (if area[i] > area[j])
'''
n = int(input())
array = []

array.append((0, 0, 0, 0))
for i in range(1, n+1):
    area, height, weight = map(int, input().split())
    array.append((i, area, height, weight))

# ���Ը� �������� �����մϴ�.
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