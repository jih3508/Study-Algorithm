'''
1. Ư�� ������ ���� ���θ��� ������ üũ�ϸ� �ȴ�.
2. Python������ dictionary�ڷ����� �ؽ�ó�� ����� �� �ִ�.
3. �� ������ set �ڷ����� �̿��� ���� ������ Ǯ �� �ִ�.
'''

n = int(input())
array = set(map(int, input().split()))
m = int(input())
x = list(map(int, input().split()))

for i in x:
    if i not in array:
        print('0')
    else:
        print('1')