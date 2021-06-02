import sys

n = int(sys.stdin.readline())
array = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
array.sort(key=lambda arr: (arr[1], arr[0]))
for x, y in array: print(x, y)