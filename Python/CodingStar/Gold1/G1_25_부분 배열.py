def sum_minimum(arr, n):
    s = 0
    for i, v in enumerate(arr):
        s += v * pow(2,n-i) # 가장 적은 수는 많이 더한다.
    return s

arr = list(map(int, input().split()))
print(sum_minimum(arr, len(arr)-1))