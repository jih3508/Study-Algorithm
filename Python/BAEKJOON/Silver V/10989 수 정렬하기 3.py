import sys
n = int(sys.stdin.readline())

arr = dict()
for _ in range(n):
    k = int(sys.stdin.readline())
    if k not in arr:
        arr[k] = 1
    else: arr[k] +=1
for i in sorted(arr.keys()):
    if i in arr:
        for _ in range(arr[i]): print(i)