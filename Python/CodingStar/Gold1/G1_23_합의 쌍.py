def piar(arr, n):
    a = arr.index(min(arr)) # ���� �� ��ġ
    b = arr.index(max(arr)) # ū �� ��ġ
    r = len(arr)
    cnt = 0
    while a != b: # ������ �� ����
        if arr[a] + arr[b] ==n: # ���̰� ���� ���
            cnt += 1
            if (a+1)%r == b: return cnt # �����ܰ��϶� ����
            a = (a+1)%r # �� ���� ū �� �̵�
            b = (r + b -1)%r  # �� ���� ���� �� �̵�
        elif arr[a] + arr[b] > n: # ���� Ŭ ��� ���� 
            b = (r + b -1)%r
        else: a = (a+1)%r # ���� ���
    return cnt

arr = list(map(int, input().split()))
n = int(input())
print(piar(arr, n))