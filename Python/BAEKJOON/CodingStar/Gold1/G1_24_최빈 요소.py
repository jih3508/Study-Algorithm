arr = list(map(int, input().split()))
m = arr.count(max(arr, key=arr.count)) # ������ ���� ���� �� �����´�.
print(m)
for i in sorted(list(set(arr))): # �ߺ��� �� ���� �� ��
    if m == arr.count(i): # ���� ū �� �����´�.
        print(i, end=' ')