#1. ���ÿ� ���Ҹ� ������ ����, �ܼ��� Ư�� ���� ������ ������ �����ϸ� �ȴ�.
#2. ���ÿ��� ���Ҹ� ���޾� ���� �� ���������� ������ �� �ִ��� Ȯ���Ѵ�.

n = int(input())

count = 1
stack = []
result = []

for i in range(1, n+1): # ������ ������ŭ �ݺ�
    data = int(input())
    while count <= data: # �Է� ���� �����Ϳ� ������ ������ ����
        stack.append(count)
        count += 1
        result.append('+')
    if stack[-1] == data: # ������ �ֻ��� ���Ұ� �����Ϳ� ���� �� ���
        stack.pop()
        result.append('-')
    else: # �Ұ����� ���
        print('NO')
        exit(0)
        
print('\n'.join(result))