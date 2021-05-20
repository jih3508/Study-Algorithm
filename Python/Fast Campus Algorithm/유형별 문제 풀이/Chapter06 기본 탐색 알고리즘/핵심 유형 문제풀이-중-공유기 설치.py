'''
1. ���� ���� N�� �ִ� 200,000�̸�, ���� ��ǥ X�� �ִ� 1,000,000,000�̴�.
2. ���� Ž���� �̿��Ͽ� O(N * logX)�� ������ �ذ��� �� �ֽ��ϴ�.
3. ���� ������ �� ������ ������ �ִ� Gap�� ���� Ž������ ã�´�.
'''
n, c = list(map(int, input().split(' ')))

array = []
for _ in range(n):
    array.append(int(input()))
array = sorted(array)

start = array[1] - array[0]
end = array[-1] - array[0]
result = 0

while(start <= end):
    mid = (start + end) // 2 # mid�� Gap�� �ǹ� �Ѵ�.
    value = array[0]
    count = 1
    for i in range(1, len(array)):
        if array[i] >= value + mid:
            value = array[i]
            count += 1
    if count >= c: # C�� �̻��� �����⸦ ��ġ�� �� �ִ� ���
        start = mid + 1
        result = mid
    else: # C�� �̻��� �����⸦ ��ġ�� �� ���� ���
        end = mid - 1   
        
print(result)