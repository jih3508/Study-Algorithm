'''
���� Ǯ�� �ٽ� ���̵��
1. ���ڿ� ũ�Ⱑ �ִ� 1,000,000�̹Ƿ� �ùķ��̼� ������� ������ �ذ� �� ��
2. ������ Ȱ���Ͽ� �����ð� ������ �ذ��� �� �ִ� �˰����� ����
1) ���� �� ���� �����, ���� �� ���� �߰� ������ Ŀ��(Cursor)�� ���� �Ѵ�.
2) ���� �Է�: ���� ���ÿ� ���Ҹ� �����Ѵ�.
3) -�Է�: ���� ���ÿ��� ���Ҹ� �����Ѵ�.
4) <�Է�: ���� ���ÿ��� ������ �������� ���Ҹ� �̵��Ѵ�.
5) >�Է�: ������ ���ÿ��� ���� �������� ���Ҹ� �̵��Ѵ�.
'''

test_case = int(input())

for _ in range(test_case):
    left_stack = []
    right_stack = []
    data = input()
    for i in data:
        if i == '-':
            if left_stack:
                left_stack.pop()
        elif i == '<':
            if left_stack:
                right_stack.append(left_stack.pop())
        elif i == '>':
            if right_stack:
                left_stack.append(right_stack.pop())
        else:
            left_stack.append(i)
    left_stack.extend(reversed(right_stack))
    print(''.join(left_stack))