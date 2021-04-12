from collections import Counter

n = int(input())
arr1 = list(map(int, input().split()))
m = int(input())
arr2 = list(map(int, input().split()))
arr1 = Counter(arr1)

for data in arr2:
    print(arr1[data] if data in arr1 else 0, end = ' ') 