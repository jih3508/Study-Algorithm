'''
1. (x��ǥ, y��ǥ)�� �Է� ���� �� x ��ǥ, y ��ǥ ������� ���ʴ�� �������� �����մϴ�.
2. ���̽��� �⺻ ���� ���̺귯���� �⺻������ Ʃ���� �ε��� ������� �������� �����Ѵ�.
3. ���� �ܼ��� �⺻ ���� ���̺귯���� �̿��ϸ� �ȴ�. (key �Ӽ� ���� ����)
'''

n = int(input())

array = []
for _ in range(n):
    x, y = map(int, input().split(' '))
    array.append((x, y))
    
array = sorted(array)

for i in array:
    print(i[0], i[1])