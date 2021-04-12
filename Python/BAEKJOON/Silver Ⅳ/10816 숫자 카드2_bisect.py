from bisect import bisect_left, bisect_right

n = int(input())
arr1 = list(map(int, input().split()))
m = int(input())
arr2 = list(map(int, input().split()))
arr1.sort()

for data in arr2:
    print(bisect_right(arr1, data)-bisect_left(arr1, data), end=' ')