arr = list(map(int, input().split(',')))
print(max(arr, key=arr.count))