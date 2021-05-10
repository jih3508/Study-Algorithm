'''
1. �������� ������ �ִ� 10,000,000�� �Դϴ�.
2. �ð� ���⵵ O(N)�� ���� �˰����� �̿��ؾ� �Ѵ�.
3. ���� ������ 1~10,000�̹Ƿ� ��� ������ �̿��� �� �ִ�.

��� ����(Counting Sort) �˰���
- �迭�� �ε����� Ư���� �������� ������ ����� ���� ����Դϴ�.
- �迭�� ũ��� �������� ������ ������ �� �ֵ��� �����Ѵ�.
- �����Ͱ� ������ Ƚ���� ����.
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