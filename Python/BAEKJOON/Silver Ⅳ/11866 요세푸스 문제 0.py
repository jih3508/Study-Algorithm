N, K = map(int, input().split())
arr1 = list(range(1, N+1))
i = K - 1
arr2 = list([])
r = 0
while arr1:
    r = (r + len(arr1)) % K # �ڿ� ���� ���� ���ϱ�
    arr2.extend(arr1[i::K]) # �� ���忡 ���� �� ��� ������� ����
    del arr1[i::K] # ���� �� ��� ����
    i = K - r - 1 # ���� ���� ��ġ ����
print("<", end='')
print(", ".join(map(str, arr2)), end="")
print(">")