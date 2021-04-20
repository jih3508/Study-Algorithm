import sys

n = int(sys.stdin.readline())
point = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
for x, y in sorted(point):
    print(x, y)