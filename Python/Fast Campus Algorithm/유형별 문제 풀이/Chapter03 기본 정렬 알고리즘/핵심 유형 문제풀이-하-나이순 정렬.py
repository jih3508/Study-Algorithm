'''
1.(����, �̸�)�� ������ �Է� ���� �ڿ� ���̸� �������� �����Ѵ�.
2. ���̽��� �⺻ ���� ���̺귯���� �̿��ϸ� �ȴ�.
3. ���̰� ������ ���, ���� �Էµ� �̸� ������ �������� key �Ӽ��� �����ؾ� �Ѵ�.
'''
n = int(input())

array = []

for _ in range(n):
    input_data = input().split(' ')
    array.append((int(input_data[0]), input_data[1]))

array = sorted(array, key = lambda x:x[0])
for i in array:
    print(i[0], i[1])