from itertools import product

data = ['A', 'B', 'C'] #������ �غ�

result = list(product(data, repeat=2))# 2���� �̴� ��� ���� ���ϱ� (�ߺ� ���)
print(result)