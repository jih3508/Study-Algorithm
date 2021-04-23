import sys
cut = lambda arr, x: sum([k//x for k in arr])

K, N = map(int, sys.stdin.readline().split())
line = [int(sys.stdin.readline()) for i in range(K)]
start, end =1,  max(line)
while start <= end:
    mid = (start + end) // 2
    if cut(line, mid) >= N:
        start = mid + 1
    else:
        end = mid - 1
print(end)