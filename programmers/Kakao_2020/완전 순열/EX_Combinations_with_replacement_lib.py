from itertools import combinations_with_replacement

data = ['A', 'B', 'C'] #������ �غ�

result = list(combinations_with_replacement(data, 2))# 2���� �̴� ��� �� ���ϱ� (�ߺ� ���)
print(result)