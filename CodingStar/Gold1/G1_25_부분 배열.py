def sum_minimum(arr, n):
    s = 0
    for i, v in enumerate(arr):
        s += v * pow(2,n-i) # ���� ���� ���� ���� ���Ѵ�.
    return s

arr = list(map(int, input().split()))
print(sum_minimum(arr, len(arr)-1))