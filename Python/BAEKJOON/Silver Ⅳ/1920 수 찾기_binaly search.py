N = int(input())
A = list(map(int, input().split()))
A.sort() # �̺�Ž���� ���� ����
M = int(input())
array = list(map(int, input().split()))

for num in array:
    # ������, ����, �迭�� ���� ���� �ʱ�ȭ
    start, end = 0, N - 1
    isInNum = 0
    # �̺� Ž��
    while start <= end:
        mid = (start + end) // 2 # �߰��� ���
        if A[mid] == num:
            isInNum = 1
            break
        elif A[mid] < num:
            start = mid + 1
        else:
            end = mid - 1
    print(isInNum)