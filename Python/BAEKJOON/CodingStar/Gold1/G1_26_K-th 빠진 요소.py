def k_th(n, arr):
    # 1. ����Ʈ�� �������� �ٲ㼭 �������� ���Ѵ�.
    # 2. �ٽ� ����Ʈ�� ���� �����Ѵ�.
    s = sorted(list(set(range(min(arr), max(arr)+1)) - set(arr)))
    return s[n-1] if len(s) >= n else -1 # k��°�� ������ ����Ʈ������ ũ�� -1�� ��ȯ�Ѵ�.
    
n = int(input())
arr = list(map(int, input().split()))
print(k_th(n, arr))